package com.faya.co.elog.util;

import com.faya.co.elog.domain.Error;
import com.faya.co.elog.domain.Solution;
import com.faya.co.elog.dto.ErrorDto;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ErrorMapper {


    public static Function<List<Solution>,List<Long>> toSolutionId=(solutions)->{
      return solutions.stream().map(Solution::getId).collect(Collectors.toList());
    };
    public static Function<Error, ErrorDto> toErrorDto=(error)->{
        ErrorDto errorDto=  new ErrorDto();
        errorDto.setCause(error.getCause());
        errorDto.setId(error.getId());
        errorDto.setDescription(error.getDescription());
        errorDto.setMessage(error.getMessage());
        errorDto.setSeverity(String.valueOf(error.getSeverity()));
        errorDto.setName(error.getName());
        errorDto.setTags(error.getTags());
        errorDto.setSolutionsId(toSolutionId.apply(error.getSolutions()));
        return errorDto;
    };
}
