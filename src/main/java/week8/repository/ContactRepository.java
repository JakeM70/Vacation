package week8.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import week8.beans.Destination;

/**
 * @author jakem - jrmeyer4
 * CIS175 - Fall 2021
 * Oct 20, 2021
 */
@Repository
public interface ContactRepository extends JpaRepository<Destination, Long> {

}
