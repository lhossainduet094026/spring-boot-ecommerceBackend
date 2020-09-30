package src.main.java.com.luv2code.ecommerce.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name="product")
@Data//this annotation for lombok project.automatically generate getter/setter
public class Product {
private long id;
private String sku;
private String name;
private String description ;
private BigDecimal unitPrice;
private String imageUrl;
private boolean active;
private int unitsInStock;
private Date dateCreated;
private Date lastUpdated;

}
