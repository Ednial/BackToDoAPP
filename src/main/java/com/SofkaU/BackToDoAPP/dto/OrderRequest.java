package com.SofkaU.BackToDoAPP.dto;

import com.SofkaU.BackToDoAPP.entity.DoList;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class OrderRequest {
    private DoList doList;
}
