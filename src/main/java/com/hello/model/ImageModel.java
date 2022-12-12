package com.hello.model;


import static javax.persistence.GenerationType.IDENTITY;

import javax.persistence.*;

import com.hello.sec.AppUser;

//@Entity
//@Table(name = "image_table")
public class ImageModel {
//
//	public ImageModel() {
//		super();
//	}
//
//	public ImageModel(String name, String type, byte[] picByte,Foundation foundation ) {
//		this.name = name;
//		this.type = type;
//		this.picByte = picByte;
//		this.foundation = foundation;
//	}
//	public ImageModel(String name, String type, byte[] picByte ) {
//		this.name = name;
//		this.type = type;
//		this.picByte = picByte;
//		
//	}
//
////	@Id
////	@Column(name = "id")
////	@GeneratedValue(strategy = GenerationType.IDENTITY)
////	private int id;
//
//    private Integer id;
//	
//    @Id
//    @GeneratedValue(strategy = IDENTITY)
//    @Column(name = "id", unique = true, nullable = false)
//    public Integer getId() {
//        return this.id;
//    }
//	
//	
//	@Column(name = "name")
//	private String name;
//
//	@Column(name = "type")
//	private String type;
//    
//    private Foundation foundation;
//	
//    //image bytes can have large lengths so we specify a value
//    //which is more than the default length for picByte column
//	@Column(name = "picByte", length = 1000)
//	private byte[] picByte;
//
//	public String getName() {
//		return name;
//	}
//
//	  public void setId(Integer id) {
//	        this.id = id;
//	    }
//	
//	public void setName(String name) {
//		this.name = name;
//	}
//
//	public String getType() {
//		return type;
//	}
//
//	public void setType(String type) {
//		this.type = type;
//	}
//
//	public byte[] getPicByte() {
//		return picByte;
//	}
//
//	public void setPicByte(byte[] picByte) {
//		this.picByte = picByte;
//	}
//    @ManyToOne(fetch=FetchType.EAGER , cascade = CascadeType.MERGE)
//    @JoinColumn(name="foundation_id", nullable=true)
//    public Foundation getFoundation() {
//        return foundation;
//    }
//    
////    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.MERGE)
////    @JoinColumn(name = "appUser_id", nullable = false)
////    public AppUser getAppUser() {
////        return appUser;
////    }
//
//    public void setFoundation(Foundation foundation) {
//        foundation = foundation;
//    }
	
	
}
