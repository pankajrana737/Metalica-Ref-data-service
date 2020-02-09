/**
 * 
 */
package com.pankaj.metallica.MetalicaRefdataservice.bean;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author INFOSYS-756761
 *
 */
public interface LocationRepository extends JpaRepository<LocationBean, Long> {
	
	LocationBean findLocationbyId(Long id);

}
