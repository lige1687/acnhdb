package com.ecnudbcourse.acnhdb.service;

import com.ecnudbcourse.acnhdb.entity.Photos;
import com.ecnudbcourse.acnhdb.mapper.PhotosMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class PhotosService {

    @Autowired
    private PhotosMapper photosMapper;

    public List<Photos> findByName(String name) { return photosMapper.findByName(name); }

    public int insertPhotos(Photos photos) { return photosMapper.insertPhotos(photos); }

    public int updatePhotos(Photos photos) { return photosMapper.updatePhotos(photos); }

    public int deleteById(Long id) { return photosMapper.deleteById(id); }

    public List<Photos> getAll() { return photosMapper.selectList(null); }

    public Photos getById(Long id) { return photosMapper.selectById(id); }

}
