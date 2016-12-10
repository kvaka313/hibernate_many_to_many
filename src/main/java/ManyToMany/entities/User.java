package ManyToMany.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="myusers")
public class User {
	   @Id
	    @GeneratedValue
	    private Long id;
	    
	    @Column(name = "name")
	    private String name;
	    
	    @Column(name = "surname")
	    private String surname;
	    
	     @ManyToOne
	     @JoinColumn(name = "room_id", foreignKey = @ForeignKey(name = "PERSON_ID_FK"))
	     Room room;

	      
	    public String getSurname() {
			return surname;
		}


		public void setSurname(String surname) {
			this.surname = surname;
		}


		public Room getRoom() {
			return room;
		}


		public void setRoom(Room room) {
			this.room = room;
		}


		public User(){}
	    
	  	    
	    public Long getId() {
	        return id;
	    }

	    public void setId(Long id) {
	        this.id = id;
	    }

	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }
	   
}
