
package com.portfolio.Portfolio.Controller;

import com.portfolio.Portfolio.model.About;
import com.portfolio.Portfolio.model.Education;
import com.portfolio.Portfolio.model.Experience;
import com.portfolio.Portfolio.model.Projects;
import com.portfolio.Portfolio.model.Skills;
import com.portfolio.Portfolio.model.User;
import com.portfolio.Portfolio.service.IAboutService;
import com.portfolio.Portfolio.service.IEducationService;
import com.portfolio.Portfolio.service.IExperienceService;
import com.portfolio.Portfolio.service.IProjectsService;
import com.portfolio.Portfolio.service.ISkillsService;
import com.portfolio.Portfolio.service.IUserService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author malen
 */
@RestController
public class Controller {
    
    
    @Autowired
    private IAboutService abServ;
    @Autowired
    private IUserService userServ;
    @Autowired
    private IExperienceService exServ;
    @Autowired
    private IEducationService edServ;
    
    @Autowired
    private ISkillsService skillsServ;
    
    @Autowired
    private IProjectsService projServ;
    
    @PutMapping ("/about/save/{id}")
    @CrossOrigin(origins = "http://localhost:4200")
    public void saveAbout (@PathVariable Long id, @RequestBody About ab) {
        abServ.save(id, ab);
    }
    
    @ResponseBody
    @GetMapping ("/see/about/{id}")
    @CrossOrigin(origins = "http://localhost:4200")
    public About buscarAbout(@PathVariable Long id){
        return abServ.search(id);
    }
    
    @PostMapping ("/login")
    @CrossOrigin(origins = "http://localhost:4200")
    public User login(@RequestBody User loginInfo) {
        return userServ.login(loginInfo.getUsername());
    }
    
    @ResponseBody
    @GetMapping ("/see/experience")
    @CrossOrigin(origins = "http://localhost:4200")
    public List<Experience> buscarExperiences(){
        return exServ.search();
    }
    
    @ResponseBody
    @GetMapping ("/see/experience/{id}")
    @CrossOrigin(origins = "http://localhost:4200")
    public Experience buscarExperience(@PathVariable Long id){
        return exServ.searchExp(id);
    }
    
    @PostMapping ("/experience/save")
    @CrossOrigin(origins = "http://localhost:4200")
    public void createExp (@RequestBody Experience ex) {
        exServ.create(ex);
    }
    
    @PutMapping ("/experience/save/{id}")
    @CrossOrigin(origins = "http://localhost:4200")
    public void saveExp (@PathVariable Long id, @RequestBody Experience ex) {
        exServ.save(id, ex);
    }
    
    @DeleteMapping("/experience/delete/{id}")
    @CrossOrigin(origins = "http://localhost:4200")
    public void deleteExp(@PathVariable Long id) {
        exServ.deleteExp(id);
    }
    
    @ResponseBody
    @GetMapping ("/see/education")
    @CrossOrigin(origins = "http://localhost:4200")
    public List<Education> buscarEducations(){
        return edServ.search();
    }
    
    @ResponseBody
    @GetMapping ("/see/skills")
    @CrossOrigin(origins = "http://localhost:4200")
    public List<Skills> buscarSkills(){
        return skillsServ.search();
    }
    
    @ResponseBody
    @GetMapping ("/see/projects")
    @CrossOrigin(origins = "http://localhost:4200")
    public List<Projects> buscarProjects(){
        return projServ.search();
    }
    
}
    
