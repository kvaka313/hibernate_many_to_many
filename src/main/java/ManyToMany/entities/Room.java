package ManyToMany.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="rooms")
public class Room {
	
	 @Id
	    @GeneratedValue
	    private Long id;
	 
	    
	    @Column(name = "roomNo")
	    private String roomNo;
	    
	    @OneToMany(mappedBy = "room",cascade = CascadeType.ALL, orphanRemoval = true)
	    private List<User> accounts = new ArrayList<>();

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getRoomNo() {
			return roomNo;
		}

		public void setRoomNo(String roomNo) {
			this.roomNo = roomNo;
		}

		public List<User> getAccounts() {
			return accounts;
		}

		public void setAccounts(List<User> accounts) {
			this.accounts = accounts;
		}
	    
	    


}
