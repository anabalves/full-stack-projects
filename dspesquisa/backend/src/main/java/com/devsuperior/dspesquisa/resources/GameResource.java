package com.devsuperior.dspesquisa.resources;

import java.util.List;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.dspesquisa.dto.GameDTO;
import com.devsuperior.dspesquisa.services.GameService;

@RestController
@RequestMapping(value = "/games")
@Api(value = "/games", tags = "DSPesquisa API", description = "API Para Realizar Pesquisa sobre Jogos Favoritos")
public class GameResource {
	
	@Autowired
	private GameService gameService;
	
	@GetMapping
	@ApiOperation(value = "Fetch all games details", notes = "get all games")
	public ResponseEntity<List<GameDTO>> findAll() {
		List<GameDTO> list = gameService.findAll();
		return ResponseEntity.ok().body(list);
	}
	
}
