package com.github.jtrinity.common;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public interface Logs {
     Logger MISC = LoggerFactory.getLogger("server.misc");
     Logger sql = LoggerFactory.getLogger("sqlLogger");
     Logger SERVER_LOADING = LoggerFactory.getLogger("server.loading");

}
