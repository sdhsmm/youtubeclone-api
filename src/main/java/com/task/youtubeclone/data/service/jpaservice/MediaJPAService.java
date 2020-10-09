package com.task.youtubeclone.data.service.jpaservice;

import java.util.Set;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.task.youtubeclone.data.domain.Media;
import com.task.youtubeclone.data.repo.MediaRepo;
import com.task.youtubeclone.data.service.MediaService;

@Service
public class MediaJPAService implements MediaService {

	@Autowired
	MediaRepo mediaRepo;

	@Override
	public Set<Media> getAllMedia() {
		return mediaRepo.findAll().stream().collect(Collectors.toSet());
	}

}
