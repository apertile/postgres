package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Article;
import com.example.demo.model.Customer;
import com.example.demo.model.HumanFiltered;
import com.example.demo.model.Search;
import com.example.demo.model.User;
import com.example.demo.model.mongo.ArticleMongo;
import com.example.demo.model.mongo.CustomerMongo;
import com.example.demo.model.mongo.HumanFilteredMongo;
import com.example.demo.model.mongo.UserMongo;
import com.example.demo.repository.ArticleRepository;
import com.example.demo.repository.CustomerRepository;
import com.example.demo.repository.HumanFilteredRepository;
import com.example.demo.repository.SearchRepository;
import com.example.demo.repository.UserRepository;
import com.example.demo.repository.mongo.ArticleMongoRepository;
import com.example.demo.repository.mongo.CustomerMongoRepository;
import com.example.demo.repository.mongo.UserMongoRepository;

import io.swagger.annotations.ApiOperation;

@RestController
public class MyController {

    @Autowired
    ArticleRepository articlePostgreRepo;
    
    @Autowired
    UserRepository userPostgreRepo;
    
    @Autowired
    CustomerRepository customerPostgreRepo;
    
    @Autowired
    SearchRepository searchPostgreRepo;
    
    @Autowired
    HumanFilteredRepository humanFilteredRepo;

    @Autowired
    ArticleMongoRepository articleMongoRepo;
    
    @Autowired
    UserMongoRepository userMongoRepo;
    
    @Autowired
    CustomerMongoRepository customerMongoRepo;
    
    @ApiOperation(value = "Get Article table")
    @RequestMapping(value = "/articlesPostgre", method = RequestMethod.GET, produces = "application/json")
    public void getOptimalResourceForRoom() {
        for (int i = 0; i < 10000; i++) {

            Page<ArticleMongo> articlesMongo = articleMongoRepo.findNotInsertedInMongo(new PageRequest(i, 10));
            for (ArticleMongo article : articlesMongo) {
                Article articlePostgre = new Article();
                articlePostgre.setVtKey(article.getVtKey());
                if (article.getAuthor() != null)
                    articlePostgre.setAuthor(article.getAuthor());
                if (article.getBody() != null)
                    articlePostgre.setBody(article.getBody());
                if (article.getCpreMediaType() != null)
                    articlePostgre.setCpreMediaType(article.getCpreMediaType());
                if (article.getFoundDT() != null)
                    articlePostgre.setFoundDT(article.getFoundDT().toDate());
                if (article.getLanguageCode() != null)
                    articlePostgre.setLanguageCode(article.getLanguageCode());
                if (article.getMediaType() != null)
                    articlePostgre.setMediaType(article.getMediaType());
                if (article.getNodContentID() != null)
                    articlePostgre.setNodContentId(article.getNodContentID());
                if (article.getOrionScionDT() != null)
                    articlePostgre.setOrionScionDT(article.getOrionScionDT().toDate());
                if (article.getPermalink() != null)
                    articlePostgre.setPermalink(article.getPermalink());
                if (article.getPublicationName() != null)
                    articlePostgre.setPublicationName(article.getPublicationName());
                if (article.getPublishedOnDT() != null)
                    articlePostgre.setPublishedOnDT(article.getPublishedOnDT().toDate());
                if (article.getTitle() != null)
                    articlePostgre.setTitle(article.getTitle());
                articlePostgreRepo.save(articlePostgre);
                article.setInPostgre(true);
                articleMongoRepo.save(article);
                
            }
        }
    }
    
    @ApiOperation(value = "Copy User table")
    @RequestMapping(value = "/user", method = RequestMethod.GET, produces = "application/json")
    public void getUsers() {
        for (int i = 0; i < 10; i++) {

            Page<UserMongo> usersMongo = userMongoRepo.findNotInsertedInMongo(new PageRequest(i, 10));
            for (UserMongo user : usersMongo) {
                User userPostgre = new User();
                if (user.getLastLoginTime() != null)
                    userPostgre.setLastLoginTime(user.getLastLoginTime().toDate());
                if(user.getName() != null)
                    userPostgre.setName(user.getName());
                if(user.getPassword() != null)
                    userPostgre.setPassword(user.getPassword());
//                if(user.getRole() != null){
//                    String[] roles = {};
//                    for(int j = 0; i<user.getRole().size() ; j++){
//                        roles[j] = user.getRole().get(i);
//                    }
//                    userPostgre.setRole(roles);
//                }                    
                if(user.getStatus() != null)
                    userPostgre.setStatus(user.getStatus());
                if(user.getUsername() != null)
                    userPostgre.setUsername(user.getUsername());
                if(user.getWorkflow() != null)
                    userPostgre.setWorkflow(user.getWorkflow());
                userPostgreRepo.save(userPostgre);
                user.setInPostgre(true);
                userMongoRepo.save(user);
                
            }
        }
    }
    
    @ApiOperation(value = "Copy Customer table")
    @RequestMapping(value = "/customer", method = RequestMethod.GET, produces = "application/json")
    public void getCustomers() {
        for (int i = 0; i < 10; i++) {

            Page<CustomerMongo> customersMongo = customerMongoRepo.findNotInsertedInMongo(new PageRequest(i, 10));
            for (CustomerMongo customer : customersMongo) {
                Customer customerPostgre = new Customer();
                if(customer.getCategory() != null)
                    customerPostgre.setCategory(customer.getCategory());
                customerPostgre.setCustomerid(customer.getCompanyId());
                if(customer.getCompanyName() != null)
                    customerPostgre.setName(customer.getCompanyName());
                if(customer.getDefaultDataGroupId() != null)
                    customerPostgre.setDefaultDataGroup(customer.getDefaultDataGroupId());
                if(customer.getNodDbId() != null)
                    customerPostgre.setNodDbId(customer.getNodDbId());
                if(customer.getVisibleAPIKey() != null)
                    customerPostgre.setApikey(customer.getVisibleAPIKey());
                if(customer.getVisibleWorkspaceId() != null)
                    customerPostgre.setWorkspaceid(customer.getVisibleWorkspaceId());
                customerPostgreRepo.save(customerPostgre);
                customer.setInPostgre(true);
                customerMongoRepo.save(customer);                
            }
        }
    }
    
    @ApiOperation(value = "Copy Search table")
    @RequestMapping(value = "/search", method = RequestMethod.GET, produces = "application/json")
    public void getSearches() {
        for (int i = 0; i < 10000; i++) {

            Page<ArticleMongo> articlesMongo = articleMongoRepo.findSearchNotInsertedInMongo(new PageRequest(i, 10));
            for (ArticleMongo article : articlesMongo) {
                for(HumanFilteredMongo humanFiltered : article.getHumanFiltered()){
                    if(searchPostgreRepo.findOne(humanFiltered.getSearchId()) == null){
                        Search search = new Search();
                        search.setSearchid(humanFiltered.getSearchId());
                        if(humanFiltered.getSearchAgentName()!=null)
                            search.setSearchAgentName(humanFiltered.getSearchAgentName());
                        if(humanFiltered.getSearchQuery()!=null)
                            search.setQuery(humanFiltered.getSearchQuery());
                        if(humanFiltered.getSearchType()!=null)
                            search.setType(humanFiltered.getSearchType());
                        if(humanFiltered.getRoutingOption()!=null)
                            search.setRoutingOption(humanFiltered.getRoutingOption());
                        if(humanFiltered.getBrief()!=null)
                            search.setBrief(humanFiltered.getBrief());
                        searchPostgreRepo.save(search);                        
                    }
                    humanFiltered.setSearchInPostgre(true);
                }
                articleMongoRepo.save(article);                
            }
        }
    }
    
    @ApiOperation(value = "Copy HumanFiltered table")
    @RequestMapping(value = "/humanFiltered", method = RequestMethod.GET, produces = "application/json")
    public void getHumanFIltered() {
        for (int i = 0; i < 20000; i++) {

            Page<ArticleMongo> articlesMongo = articleMongoRepo.findHumanFilteredNotInsertedInMongo(new PageRequest(i, 10));
            for (ArticleMongo articleMongo : articlesMongo) {
                for(HumanFilteredMongo humanFilteredMongo : articleMongo.getHumanFiltered()){
                    HumanFiltered humanFiltered = new HumanFiltered();
                    Article vtkey = articlePostgreRepo.findByVtKey(articleMongo.getVtKey());
                    humanFiltered.setVtkey(vtkey);
                    if(humanFilteredMongo.getCompanyId()!=null){
                        Customer customer = customerPostgreRepo.findOne(humanFilteredMongo.getCompanyId());
                        humanFiltered.setCustomerid(customer);
                    }
                    if(humanFilteredMongo.getSearchId()!=null){
                        Search search = searchPostgreRepo.findOne(humanFilteredMongo.getSearchId());
                        humanFiltered.setSearchid(search);
                    }
                    humanFiltered.setUserid(null);
                    if(humanFilteredMongo.getStatus()!=null)
                        humanFiltered.setStatus(humanFilteredMongo.getStatus().toString());
                    humanFilteredRepo.save(humanFiltered);
                    humanFilteredMongo.setHumanFilteredInPostgre(true);                    
                }
                articleMongoRepo.save(articleMongo);
            }
        }
    }


}
