package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.entity.ProductEntity;
import com.demo.entity.TvEntity;
import com.demo.entity.WatchEntity;
import com.demo.repository.TvRepository;
import com.demo.repository.WatchRepository;

@RestController
@RequestMapping ("/model")


public class ProductController {
	 @Autowired
	    private TvRepository tvRepo;
	 
	    @Autowired
	    private WatchRepository watchRepo;
	 
	    
//	    @GetMapping("/user")
//	    public List<ProductEntity> getAlldemo()
//	    {
//	        List<ProductEntity> demo=Repo.findAll();
//	        return demo ;
//
//	    }

	    @GetMapping("/products")
	    public List<TvEntity> gettvs()
	    {
	        List<TvEntity> demo=tvRepo.findAll();
	        return demo ;

	    }
	    @GetMapping("/java")
	    public List<WatchEntity> getwatches()
	    {
	        List<WatchEntity> demo=watchRepo.findAll();
	        return demo ;

	    }




//	    @GetMapping("/getdata/{id}")
//	    public Optional<User> getUserById(@PathVariable int id)
//	    {
//	        Optional<User> u = Repo.findById(id);
//	        return u;
//	    }

//	    @PostMapping("/data")
//	    public String saveStudents(@RequestBody ProductEntity user)
//	    {
//	    ProductEntity save = tvRepo.save();
//	    if(save!=null)
//	    {
//	    return "your login was success";
//	    }
//	    else
//	    {
//
//	    return "your login was un success";
//	    }
//	    }

}
