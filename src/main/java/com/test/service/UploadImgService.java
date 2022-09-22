package com.test.service;

import java.io.File;

import org.springframework.web.multipart.MultipartFile;

public interface UploadImgService {
	
	File save(MultipartFile file, String folder);
}
