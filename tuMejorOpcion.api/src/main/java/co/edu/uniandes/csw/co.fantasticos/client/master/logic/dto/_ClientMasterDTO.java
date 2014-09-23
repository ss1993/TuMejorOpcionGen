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
  
  
  Source generated by CrudMaker version 1.0.0.201408112050*/

package co.edu.uniandes.csw.co.fantasticos.client.master.logic.dto;

import co.edu.uniandes.csw.co.fantasticos.giftcard.logic.dto.GiftCardDTO;
import co.edu.uniandes.csw.co.fantasticos.client.logic.dto.ClientDTO;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement
public abstract class _ClientMasterDTO {

 
    protected ClientDTO clientEntity;
    protected String id;
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    
    public ClientDTO getClientEntity() {
        return clientEntity;
    }

    public void setClientEntity(ClientDTO clientEntity) {
        this.clientEntity = clientEntity;
    }
    
    public List<GiftCardDTO> createpurchasedGiftCards;
    public List<GiftCardDTO> updatepurchasedGiftCards;
    public List<GiftCardDTO> deletepurchasedGiftCards;
    public List<GiftCardDTO> listpurchasedGiftCards;	
	
	
	
    public List<GiftCardDTO> getCreatepurchasedGiftCards(){ return createpurchasedGiftCards; };
    public void setCreatepurchasedGiftCards(List<GiftCardDTO> createpurchasedGiftCards){ this.createpurchasedGiftCards=createpurchasedGiftCards; };
    public List<GiftCardDTO> getUpdatepurchasedGiftCards(){ return updatepurchasedGiftCards; };
    public void setUpdatepurchasedGiftCards(List<GiftCardDTO> updatepurchasedGiftCards){ this.updatepurchasedGiftCards=updatepurchasedGiftCards; };
    public List<GiftCardDTO> getDeletepurchasedGiftCards(){ return deletepurchasedGiftCards; };
    public void setDeletepurchasedGiftCards(List<GiftCardDTO> deletepurchasedGiftCards){ this.deletepurchasedGiftCards=deletepurchasedGiftCards; };
    public List<GiftCardDTO> getListpurchasedGiftCards(){ return listpurchasedGiftCards; };
    public void setListpurchasedGiftCards(List<GiftCardDTO> listpurchasedGiftCards){ this.listpurchasedGiftCards=listpurchasedGiftCards; };	
	
	
}

