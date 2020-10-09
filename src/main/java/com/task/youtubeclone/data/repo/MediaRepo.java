package com.task.youtubeclone.data.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.task.youtubeclone.data.domain.Media;

public interface MediaRepo extends JpaRepository<Media, Long> {

}
