package dmacc.beans;

import javax.persistence.Embeddable;

import lombok.Data;

/**
 * Sterling Rhone - sprhone
 * 202102 CIS175 26740
 * Apr 1, 2021
 */

@Data
@Embeddable
public class Squad {
	private String squadNumber;
	private String teamAssignment;	
}
