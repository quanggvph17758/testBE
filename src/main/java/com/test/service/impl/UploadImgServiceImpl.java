package com.test.service.impl;

import java.io.File;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.test.service.UploadImgService;

@Service
public class UploadImgServiceImpl implements UploadImgService {

	@Autowired
    ServletContext app;

	@Override
    public File save(MultipartFile file, String folder){
        File dir = new File(app.getRealPath("/images/" + folder));
        if (!dir.exists()){
            dir.mkdirs();
        }
        String s = file.getOriginalFilename();
        String name = Integer.toHexString(s.hashCode()) + s.substring(s.lastIndexOf("."));
        try {
            File saveFile = new File(dir, name);
            return saveFile;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
	
	
}
