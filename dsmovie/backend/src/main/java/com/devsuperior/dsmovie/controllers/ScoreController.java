package com.devsuperior.dsmovie.controllers;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.dsmovie.dto.MovieDTO;
import com.devsuperior.dsmovie.dto.ScoreDTO;
import com.devsuperior.dsmovie.services.ScoreService;

@RestController
@RequestMapping(value = "/scores")
@Api(value = "/movies", tags = "DSMovie API", description = "API Para Realizar Avaliação de Filmes e Séries")
public class ScoreController {
	
	@Autowired
	private ScoreService scoreService;
	
	@PutMapping
	@ApiOperation(value = "Update Movie Score", notes = "Update score existing movie")
	public ResponseEntity<MovieDTO> saveScore(@RequestBody ScoreDTO dto) {
		MovieDTO movieDTO = scoreService.saveScore(dto);
		return ResponseEntity.ok().body(movieDTO);
	}
	
}
