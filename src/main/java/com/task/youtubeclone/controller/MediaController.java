package com.task.youtubeclone.controller;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.task.youtubeclone.data.domain.Media;
import com.task.youtubeclone.data.service.MediaService;

@RestController
public class MediaController {

	@Autowired
	MediaService mediaService;

	@RequestMapping(path = "/media", method = RequestMethod.GET)
	Set<Media> getAllMedia() {

		return mediaService.getAllMedia();

	}

}
