package com.insite.jbehave.utils;

public final class JbehaveConstants {
	
	private JbehaveConstants() {
    }
	

	// ################################ SA INSITE NAVIGATION MENU ITEMS

	public static final String HOME = "Home";
	public static final String QUERIES = "Queries";
	public static final String DATASOURCES = "Datasources";

	// ################################ DATACONNECTION AUTENTIACATION MENU

	public static final String POSTGRES_DATACONNECTION_NAME = "Server11";
	public static final String DATACONNECTION_ACCESS_CUSTOM = "Custom";

	// ################################ VA LOGIN WINDOW SELECTORS

	public static final String POSTGRES_AUTHENTICATOR_SELECTOR = "-1";
	public static final String SA_LOGIN_FORM_SELECTOR = ".form-content";
	public static final String AUTHENTICATORS_SELECT_FIELD_CLASS = "selection";
	public static final String AUTHENTICATORS_SELECT_LIST_CLASS = "select2-results__options";
	public static final String SA_LOGIN_BUTTON_CLASS = "login-button";

	// ################################ MAIN GRID
	
	public static final String DATATABLE_CONTENT_DIV_ID = "datatable-content";

	// ################################ QUERY PAGE
	
	public static final String ADD_QUERY_BUTTON_CLASS = "add-query";
	public static final String QUERY_DATACONNECTION_DIV_ID = "sa-query-datasource-content";
	public static final String QUERY_DATACONNECTION_NESTED_DIV_SELECTOR = ".sa-list-content-wrapper";
	public static final String QUERY_DATACONNECTION_NESTED_DIV_NAME_SELECTOR = ".sa-item-name"; 
	
	
	public static final String QUERY_DATATABLE_UL_CLASS = "datatable-ul"; 
	public static final String QUERY_LI_ID = "query-";
	public static final String QUERY_NAME_DIV_CLASS = "query-name";
	public static final String QUERY_EMPHASIZED_TEXT_DIV_CLASS = "emphasized-text";
	public static final String QUERY_LIGHT_TEXT_SPAN_CLASS = "light-text";
	public static final String QUERY_IS_FAVORITE_DIV_CLASS = "isFavourite";
	public static final String QUERY_FAVORITE_DIV_CLASS = "favourite";
	public static final String QUERY_PADDING_LEFT_SPAN_STYLE = "padding-left";
	public static final String QUERY_SA_DESCRIPTION_DIV_CLASS = "sa-description";
	public static final String QUERY_SA_SHARED_DIV_CLASS = "sa-shared";
	
	// ################################ DATACONNECTION ACCESS WINDOW
	
	public static final String ACCESS_TO_DATACONNECTION_DIV_CLASS = "panel-content";
	public static final String ACCESS_TO_DATACONNECTION_SELECT_LIST_CLASS = "selection";
	public static final String ACCESS_TO_DATACONNECTION_CREDENTIALS_ITEM_ID = "sa-ds-credential";
	public static final String ACCESS_TO_DATACONNECTION_SAVE_BUTTON_CLASS =	"save";
	
	// ################################ ADD/CREATE QUERY
	
	public static final String DATACONNECTION_TABLE_MAIN_DIV_CLASS = "sa-tree";
	public static final String DATACONNECTION_SCHEMA_THREE_CONTENT_SELECTOR = ".sa-tree-content";
	public static final String DATACONNECTION_SCHEMA_THREE_LI_SELECTOR = ".sa-tree-content li";
	public static final String DATACONNECTION_SCHEMA_THREE_ITEMS_SELECTOR = ".sa-tree-item-name";
	public static final String DATACONNECTION_SCHEMA_TABLES_LI_SELECTOR = ".sa-tree-children li";
	public static final String QUERY_LIST_DATATABLE_LI_SELECTOR = ".datatable-ul";
	public static final String QUERY_LIST_DATATABLE_ITEMS_SELECTOR = ".datatable-item";
	public static final String QUERY_LIST_QUERYNAME_SELECTOR = ".light-text";
	public static final String QUERY_LIST_QUERYCHECKBOX_SELECTOR = ".grid-checkbox";
	public static final String QUERY_LIST_MANAGE_TAGS_BUTTON = "manage-tags-trigger";
	public static final String HEADER_DIV_ID = "datatable-selection-bar";
	
	// ################################ MANAGE TAGS
	public static final String MANAGE_TAGS_DIV_ID = "dialog";
	public static final String ADD_REMOVE_TAGS_SELECT_MAIN_FIELD_CLASS = "select2-selection__rendered";
	public static final String ADD_REMOVE_TAGS_MAIN_FIELD_SELECTOR = ".select2-selection__rendered";
	public static final String ADD_REMOVE_TAGS_SELECT_MAIN_FIELD_SELECTOR = ".selection";
	public static final String INPUT_TAG_FIELD_CLASS = "select2-search__field";
	public static final String MANAGE_TAG_LIST_SELECTOR = ".select2-results";
	public static final String MANAGE_TAG_LIST_NESTED_CLASS = "select2-sa-tag-list-results";
	public static final String EXISTING_TAG_LIST_SELECTOR = ".select2-results__option";
	public static final String ADD_REMOVE_TAGS_SELECT_NESTED_SELECTOR = ".select2-selection__choice";
	public static final String REMOVE_TAG_ICON_SELECTOR = ".select2-selection__choice__remove";
	public static final String SAVE_TAG_BUTTON_CLASS = "save-button";
	public static final String ADD_REMOVE_TAG_SPAN_SELECTOR = ".select2-selection--multiple";
	
}