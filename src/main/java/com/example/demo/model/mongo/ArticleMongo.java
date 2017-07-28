package com.example.demo.model.mongo;

import java.util.ArrayList;
import java.util.List;

import org.joda.time.DateTime;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@JsonInclude(Include.NON_NULL)
@Document(collection = "Article")
public class ArticleMongo {

    private String id;

    private String author;
    
    private String authorInfluence;
    
    private String authorLink;
    
    private Integer bestCountry;
    
    private Double bestLat;
    
    private Double bestLong;
    
    private String body;    
    
    private List<String> collectionSourceTypes;
    
    private String contentId;
    
    private String contentIdMode;
    
    private Integer cpreMediaType;
    
    private String dampenedToneLabel;
    
    private Double dampenedToneMixedScore;
    
    private Double dampenedToneNegativeScore;
    
    private Double dampenedToneNeutralScore;
    
    private Double dampenedTonePositivelScore;
    
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
    @ApiModelProperty(example = "yyyy-MM-dd HH:mm:ss")
    private DateTime dedupDT;
    
    private String dmaId;
    
    private String domain;
    
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
    @ApiModelProperty(example = "yyyy-MM-dd HH:mm:ss")
    private DateTime expirationDT;
    
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
    @ApiModelProperty(example = "yyyy-MM-dd HH:mm:ss")
    private DateTime foundDT;
    
    private String geographyName;
    
    private List<HumanFilteredMongo> humanFiltered;
    
    private Boolean humanFilteredInPostgre;
    
    private String imageServiceLink;
    
    private Boolean inPostgre;
    
    private boolean isActive;
    
    private String languageCode;
    
    private List<String> listIds;
    
    private String lxaDocumentSentiment;
    
    private Double lxaDocumentSentimentScore;
    
    private String mediaGroup;
    
    private Integer mediaId;
    
    private String mediaType;
    
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
    @ApiModelProperty(example = "yyyy-MM-dd HH:mm:ss")
    private DateTime midasDT;
    
    private String monitorSearchType;
    
    private String nodAdditionalInfo;
    
    private Integer nodContentID;
    
    private Integer nodContinentId;
    
    private Integer nodCountryId;
    
    private String nodFeedOutletSourceID;
    
    private Integer nodFeedTypeId;
    
    //WARN. Parse this field to a DateTime when VTFullEnriched documents standardize this field with other date fields
    //format ('yyyy-MM-dd HH:mm:ss.SSS'). As of 06/21/2016 this field comes as 'yyyy-MM-ddTHH:mm:ss.SSSSSSS'
    private String nodLastModifiedDT;
    
    private String nodMediaOutletCHSID;
    
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
    @ApiModelProperty(example = "yyyy-MM-dd HH:mm:ss")
    private DateTime nodRouterDT;
    
    private ArrayList<String> nodRoutingIds;
    
    private String nodUniqueUrl;
    
    private Integer nodWorkingLanguageId;
    
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
    @ApiModelProperty(example = "yyyy-MM-dd HH:mm:ss")
    private DateTime normalizeDT;
    
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
    @ApiModelProperty(example = "yyyy-MM-dd HH:mm:ss")
    private DateTime orionScionDT;
    
    private String originalAuthor;
    
    private Integer packagingCountryID;
    
    private String permalink;
    
    private String permalinkHash;
    
    private Integer postCountry;
    
    private Double postLat;
    
    private String postLocation;
    
    private Integer postLocationId;
    
    private Double postLong;
    
    private String postStatus;
    
    private String preferredLanguage;
    
    private Integer preferredLanguageWeight;
    
    private String publicationName;
    
    private String publicationNameLowercase;
    
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
    @ApiModelProperty(example = "yyyy-MM-dd HH:mm:ss")
    private DateTime publishedOnDT;
    
    private Integer reach;
    
    private String remotePostID;
    
    private Boolean sampleSearchAdded;
    
    private Integer sampling;
    
    private String site;
    
    private Integer siteCountry;
    
    private Double siteLat;
    
    private Double SiteLong;
    
    private List<String> sourceId;
    
    private String subDomain;
    
    private String threadClassification;
    
    private String title;
    
    private String titleLowercase;
    
    private String toneLabel;
    
    private Double toneMixedScore;
    
    private Double toneNegativeScore;
    
    private Double toneNeutralScore;
    
    private Double tonePositiveScore;
    
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
    @ApiModelProperty(example = "yyyy-MM-dd HH:mm:ss")
    private DateTime trickleFeedFilterDT;
    
    private Double utilityScore;
    
    private String vtKey;
    
    private ArrayList<String> workspaces;

}
