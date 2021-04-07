package dmacc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import dmacc.beans.Soldier;

/**
 * Sterling Rhone - sprhone
 * 202102 CIS175 26740
 * Apr 1, 2021
 */

@Repository
public interface SoldierRepository extends JpaRepository<Soldier, Long>{
	
}
