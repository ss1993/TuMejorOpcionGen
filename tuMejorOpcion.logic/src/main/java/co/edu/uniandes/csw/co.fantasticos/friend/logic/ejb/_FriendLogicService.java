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

package co.edu.uniandes.csw.co.fantasticos.friend.logic.ejb;
import java.util.List;
import javax.inject.Inject;

import co.edu.uniandes.csw.co.fantasticos.friend.logic.dto.FriendDTO;
import co.edu.uniandes.csw.co.fantasticos.friend.logic.api._IFriendLogicService;
import co.edu.uniandes.csw.co.fantasticos.friend.persistence.api.IFriendPersistence;

public abstract class _FriendLogicService implements _IFriendLogicService {

	@Inject
	protected IFriendPersistence persistance;

	public FriendDTO createFriend(FriendDTO friend){
		return persistance.createFriend( friend); 
    }

	public List<FriendDTO> getFriends(){
		return persistance.getFriends(); 
	}

	public FriendDTO getFriend(String id){
		return persistance.getFriend(id); 
	}

	public void deleteFriend(String id){
	    persistance.deleteFriend(id); 
	}

	public void updateFriend(FriendDTO friend){
	    persistance.updateFriend(friend); 
	}	
}