package com.ssafy.onu.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Setter
@Getter
public class NutrientData {
    @Id
    private Long prdlstReportNo;
    private String bsshnm;
    private String cstdyMthd;
    private String dispos;
    private String iftknAtntMathCn;

    private double lcnsNo;
    private String ntkMthd;

    private String pogDayCnt;
    private String prdtShapCdNm;

    private String primaryFncty;
    private String prolstNm;
    private String rawmtrlNm;

    private String shap;
    private String stdrStnd;
    private String imageUrl;

    private String brand;


}
