package dmacc.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.beans.factory.annotation.Autowired;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Sterling Rhone - sprhone
 * 202102 CIS175 26740
 * Apr 1, 2021
 */


@Data
@NoArgsConstructor
@Entity
public class Soldier {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String firstName;
	private String lastName;
	private String soldierRank;
	private String ssn;
	private String jobPosition;
	@Autowired
	private Squad squadData;
	@Autowired
	private Platoon platoonData;
	@Autowired
	private Company companyData;
	@Autowired
	private Battalion battalionData;
	@Autowired
	private Regiment regimentData;
	
	public Soldier(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	
}
