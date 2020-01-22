package com.atguigu.gmall.organization.to.vo;


import com.atguigu.gmall.organization.to.po.BasePo;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
public class BaseVo<T extends BasePo> implements Serializable {
    private String id;
}
