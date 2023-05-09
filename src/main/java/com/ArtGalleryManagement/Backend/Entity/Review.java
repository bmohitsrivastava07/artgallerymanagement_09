package com.ArtGalleryManagement.Backend.Entity;

import java.util.Date;

import javax.persistence.*;

import org.hibernate.annotations.CreationTimestamp;

import lombok.Data;

@Entity
@Table(name = "reviews")
@Data
public class Review {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private Long review_id;
	@Column
	private String user_email;
	@Column
	@CreationTimestamp
	private Date date;
	@Column
	private double rating;
	@Column(name="product_id")
	private Long productId;
	@Column
	private String review_description;
}
