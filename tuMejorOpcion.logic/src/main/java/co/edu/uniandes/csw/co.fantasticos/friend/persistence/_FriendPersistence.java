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

package co.edu.uniandes.csw.co.fantasticos.friend.persistence;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import co.edu.uniandes.csw.co.fantasticos.friend.logic.dto.FriendDTO;
import co.edu.uniandes.csw.co.fantasticos.friend.persistence.api._IFriendPersistence;
import co.edu.uniandes.csw.co.fantasticos.friend.persistence.converter.FriendConverter;
import co.edu.uniandes.csw.co.fantasticos.friend.persistence.entity.FriendEntity;

public abstract class _FriendPersistence implements _IFriendPersistence {

  	@PersistenceContext(unitName="tuMejorOpcionPU")
 
	protected EntityManager entityManager;
	
	public FriendDTO createFriend(FriendDTO friend) {
		FriendEntity entity=FriendConverter.persistenceDTO2Entity(friend);
		entityManager.persist(entity);
		return FriendConverter.entity2PersistenceDTO(entity);
	}
	
	@SuppressWarnings("unchecked")
	public List<FriendDTO> getFriends() {
		Query q = entityManager.createQuery("select u from FriendEntity u");
		return FriendConverter.entity2PersistenceDTOList(q.getResultList());
	}

	public FriendDTO getFriend(String id) {
		return FriendConverter.entity2PersistenceDTO(entityManager.find(FriendEntity.class, id));
	}

	public void deleteFriend(String id) {
		FriendEntity entity=entityManager.find(FriendEntity.class, id);
		entityManager.remove(entity);
	}

	public void updateFriend(FriendDTO detail) {
		FriendEntity entity=entityManager.merge(FriendConverter.persistenceDTO2Entity(detail));
		FriendConverter.entity2PersistenceDTO(entity);
	}

}