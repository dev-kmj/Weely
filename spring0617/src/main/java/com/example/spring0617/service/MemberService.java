package com.example.spring0617.service;

import com.example.spring0617.dto.RequestCreateMemberDTO;
import com.example.spring0617.dto.RequestUpdateMemberDTO;
import com.example.spring0617.dto.ResponseMemberDTO;

import java.util.List;

public interface MemberService {
    long saveMember(RequestCreateMemberDTO requestCreateMemberDTO);
    ResponseMemberDTO findMember(Long id);
    long removeMember(Long id);
    long modifyMember(Long id, RequestUpdateMemberDTO requestUpdateMemberDTO);
    List<ResponseMemberDTO> recommendMember(Long id);
}