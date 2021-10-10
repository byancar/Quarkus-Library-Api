package org.library.application.utils;

import lombok.Data;

import javax.ws.rs.DefaultValue;
import javax.ws.rs.QueryParam;

@Data
public class PageRequest {

    @QueryParam("page")
    @DefaultValue("0")
    private Integer pageNum;

    @QueryParam("size")
    @DefaultValue("10")
    private Integer pageSize;

    @QueryParam("sort")
    @DefaultValue("id")
    private String sortBy;

}
