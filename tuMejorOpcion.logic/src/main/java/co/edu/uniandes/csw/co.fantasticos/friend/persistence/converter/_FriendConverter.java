/* ========================================================================
   * Copyright 2014 co.fantasticos
   *
   * Licensed under the MIT, The MIT License (MIT)
   * Copyright (c) 2014 co.fantasticos
  
  Permission is hereby granted, free of charge, to any person obtaining a copy
  of this software and associated documentation files (the "Software"), to deal
  in the Software without restriction, including without limitation the rights
  to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
  copies of the Software, and to permit persons to whom the Software is
  furnished to do so, subject to the following conditions:
  
  The above copyright notice and this permission notice shall be included in
  all copies or substantial portions of the Software.
  
  THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
  IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
  FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
  AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
  LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
  OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
  THE SOFTWARE.
   * ========================================================================
  
  
  Source generated by CrudMaker version 1.0.0.201410261249*/

package co.edu.uniandes.csw.co.fantasticos.friend.persistence.converter;

import java.util.ArrayList;
import java.util.List;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;


import co.edu.uniandes.csw.co.fantasticos.friend.logic.dto.FriendDTO;
import co.edu.uniandes.csw.co.fantasticos.friend.persistence.entity.FriendEntity;

public abstract class _FriendConverter {

	public static FriendDTO entity2PersistenceDTO(FriendEntity entity){
		if (entity != null) {
			FriendDTO dto = new FriendDTO();
					dto.setId(entity.getId());
					dto.setName(entity.getName());
					dto.setImgUrl(entity.getImgUrl());
			return dto;
		}else{
			return null;
		}
	}
	
	public static FriendEntity persistenceDTO2Entity(FriendDTO dto){
		if(dto!=null){
			FriendEntity entity=new FriendEntity();
					entity.setId(dto.getId());
			
					entity.setName(dto.getName());
			
					entity.setImgUrl(dto.getImgUrl());
			
			return entity;
		}else {
			return null;
		}
	}
	
	public static List<FriendDTO> entity2PersistenceDTOList(List<FriendEntity> entities){
		List<FriendDTO> dtos=new ArrayList<FriendDTO>();
		for(FriendEntity entity:entities){
			dtos.add(entity2PersistenceDTO(entity));
		}
		return dtos;
	}
	
	public static List<FriendEntity> persistenceDTO2EntityList(List<FriendDTO> dtos){
		List<FriendEntity> entities=new ArrayList<FriendEntity>();
		for(FriendDTO dto:dtos){
			entities.add(persistenceDTO2Entity(dto));
		}
		return entities;
	}
}