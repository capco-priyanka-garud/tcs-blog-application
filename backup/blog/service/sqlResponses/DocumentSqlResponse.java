package com.tcs.blog.query.service.sqlResponses;

import lombok.Data;

@Data
public class DocumentSqlResponse {
    public String documentId;
    public String docReference;
    public String docType;
    public String productType;
    public String location;
    public String partyList;
    public String relations;
    public String mleId;
    public String sleId;
    public String validUntil;
    public String metadata;
    public String indexable;
    public String propertiesObject;
    public String created;
    public String lastUpdate;

    public static class COLUMNS_NAMES{
        public static String DOCUMENT_ID="document_id";
        public static String DOC_REFERENCE="doc_reference";
        public static String DOC_TYPE="doc_type";
        public static String PRODUCT_TYPE="product_type";
        public static String LOCATION="location";
        public static String PARTY_LIST="party_list";
        public static String RELATIONS="relations";
        public static String MLE_ID="mle_id";
        public static String SLE_IS="sle_id";
        public static String VALID_UNTIL="valid_until";
        public static String METADATA="metadata";
        public static String INDEXABLE="indexable";
        public static String PROPERTIES_OBJECT="properties_object";
        public static String CREATED="created";
        public static String LAST_UPDATE="last_update";

    }



}
