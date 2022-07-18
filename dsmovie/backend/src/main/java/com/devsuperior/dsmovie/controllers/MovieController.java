package com.devsuperior.dsmovie.controllers;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.dsmovie.dto.MovieDTO;
import com.devsuperior.dsmovie.services.MovieService;

@RestController
@RequestMapping(value = "/movies")
@Api(value = "/movies", tags = "DSMovie API", description = "API Para Realizar Avaliação de Filmes e Séries")
public class MovieController {
	
	@Autowired
	private MovieService movieService;
	
	@GetMapping
	@ApiOperation(value = "Fetch all movies details", notes = "get all movies")
	public ResponseEntity<Page<MovieDTO>> findAll(Pageable pageable) {
		Page<MovieDTO> list = movieService.findAll(pageable);
		return ResponseEntity.ok(list);
	}
	
	@GetMapping(value = "/{id}")
	@ApiOperation(value = "Get Movie by Id", notes = "get movie by id if exist")
	public ResponseEntity<MovieDTO> findById(@PathVariable Long id) {
		return ResponseEntity.ok(movieService.findById(id));
	}

}
