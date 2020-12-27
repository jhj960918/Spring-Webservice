package com.jin.webservice.sevice;

import com.jin.webservice.domain.posts.PostsRepository;
import com.jin.webservice.dto.posts.PostsSaveRequestDto;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@AllArgsConstructor
@Service
public class PostsService {
    private PostsRepository postsRepository;

    @Transactional//메소드 내에서 Exception이 발생하면 해당 메소드에서 이루어진 모든 작업을 초기화 시킴
    public Long save(PostsSaveRequestDto dto){
        return postsRepository.save(dto.toEntity()).getId();
    }
}