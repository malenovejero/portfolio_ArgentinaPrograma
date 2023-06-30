
package com.portfolio.Portfolio.service;

import com.portfolio.Portfolio.model.Education;
import java.util.List;

/**
 *
 * @author malen
 */
public interface IEducationService {
    public void save (Long id, Education ed);
    public List<Education> search ();
    public Education searchEd(Long id);
}
