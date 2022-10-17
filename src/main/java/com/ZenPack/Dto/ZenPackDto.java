package com.ZenPack.Dto;

import lombok.Getter;
import lombok.Setter;
import springfox.documentation.spring.web.json.Json;

import java.util.Date;
import java.util.List;


@Getter
@Setter
public class ZenPackDto {

    private Long zenPackId;
    private String name;
    private String createdBy;
    private Date createdDate;
    private String updatedBy;
    private Date updatedTime;
    private List<MenuDto> menus;

}