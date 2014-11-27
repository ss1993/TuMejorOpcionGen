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

package co.edu.uniandes.csw.co.fantasticos.friend.master.persistence.api;

import co.edu.uniandes.csw.co.fantasticos.friend.master.persistence.entity.FriendfacebookLikesEntity;
import co.edu.uniandes.csw.co.fantasticos.shop.logic.dto.ShopDTO;
import co.edu.uniandes.csw.co.fantasticos.friend.master.persistence.entity.FriendgoogleLikesEntity;
import co.edu.uniandes.csw.co.fantasticos.shop.logic.dto.ShopDTO;
import co.edu.uniandes.csw.co.fantasticos.friend.master.logic.dto.FriendMasterDTO;
import java.util.List;

public interface _IFriendMasterPersistence {

	public FriendMasterDTO getFriend(String friendId);
	
	
    public FriendfacebookLikesEntity createFriendfacebookLikesEntity(FriendfacebookLikesEntity entity);
    public void deleteFriendfacebookLikesEntity(String friendId, String facebookLikesId);
    public List<ShopDTO> getFriendfacebookLikesEntityList(String friendId);
    public FriendgoogleLikesEntity createFriendgoogleLikesEntity(FriendgoogleLikesEntity entity);
    public void deleteFriendgoogleLikesEntity(String friendId, String googleLikesId);
    public List<ShopDTO> getFriendgoogleLikesEntityList(String friendId);
   
  
}
