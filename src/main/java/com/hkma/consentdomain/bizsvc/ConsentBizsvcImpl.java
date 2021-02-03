package com.hkma.consentdomain.bizsvc;

import com.hkma.consentdomain.config.ErrorConstants;
import com.hkma.consentdomain.repository.ConsentEntityRepository;
import com.hkma.consentdomain.repository.ConsentSessionEntityRepository;
import com.hkma.consentdomain.repository.entity.ConsentEntity;
import com.hkma.consentdomain.repository.entity.ConsentSessionEntity;
import com.hkma.consentdomain.swagger.model.ConsentRequest;
import com.hkma.consentdomain.swagger.model.ConsentResponseData;
import com.hkma.consentdomain.swagger.model.UpdateConsentRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContextException;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.*;
import java.util.stream.Collectors;

@Service
public class ConsentBizsvcImpl implements  ConsentBizsvc{

    @Autowired
    private ConsentEntityRepository consentEntityRepository;

    @Autowired
    private ConsentSessionEntityRepository consentSessionEntityRepository;

    @Override
    public ConsentResponseData getConsentResponseData(String consentId) {
        Optional<ConsentEntity> consentEntities = consentEntityRepository.findById(consentId);
        if(consentEntities.isEmpty()){
            throw new ApplicationContextException(ErrorConstants.CONSENT_NOT_FOUND);
        }else {
            if (consentId != null) {
                ConsentEntity consentEntity = consentEntities.get();
                ConsentResponseData consentResponseData = new ConsentResponseData();
                consentResponseData.setConsentId(consentEntity.getRecordId());
                consentResponseData.setCreationDate(consentEntity.getCreationDate());
                consentResponseData.setExpirationDate(consentEntity.getExpirationDate());
                List<String> mockPermission = new ArrayList<>(Arrays.asList(consentEntity.getPermissions().split(",")));
                consentResponseData.setPermissions(mockPermission);
                consentResponseData.setStatus(consentEntity.getStatus());
                consentResponseData.setStatusUpdateDate(consentEntity.getStatusUpdateDate());
                return consentResponseData;
            }
        }
        return null;
    }

    @Override
    public ConsentResponseData postConsentResponseData(ConsentRequest body) {
        String consentId = Integer.toString(10000 + new Random().nextInt(90000));
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        String currentTime = timestamp.toString();

        ConsentEntity consentEntity = new ConsentEntity();
        consentEntity.setRecordId(consentId);
        consentEntity.setCreationDate(currentTime);
        consentEntity.setStatus("PendingAuthorise");
        consentEntity.setStatusUpdateDate(currentTime);
        consentEntity.setPermissions(body.getData().getPermissions().stream().map(n -> String.valueOf(n)).collect(Collectors.joining(",")));
        consentEntity.setExpirationDate(body.getData().getExpirationDate());
        consentEntityRepository.save(consentEntity);

        ConsentResponseData consentResponseData = new ConsentResponseData();
        consentResponseData.setConsentId(consentId);
        consentResponseData.setCreationDate(currentTime);
        consentResponseData.setStatus("PendingAuthorise");
        consentResponseData.setStatusUpdateDate(currentTime);
        consentResponseData.setPermissions(body.getData().getPermissions());
        consentResponseData.setExpirationDate(body.getData().getExpirationDate());
        return consentResponseData;
    }

    @Override
    public void deleteConsent(String consentId) {
        Optional<ConsentEntity> consentEntities = consentEntityRepository.findById(consentId);
        if(consentEntities.isEmpty()){
            throw new ApplicationContextException(ErrorConstants.CONSENT_NOT_FOUND);
        }else {
            if (consentId != null) {
                ConsentEntity consentEntity = consentEntities.get();
                Timestamp timestamp = new Timestamp(System.currentTimeMillis());
                String currentTime = timestamp.toString();
                consentEntity.setDeletionDate(currentTime);
                consentEntityRepository.save(consentEntity);
            }
        }
    }

    @Override
    public void updateConsent(String consentId, UpdateConsentRequest body) {
        Optional<ConsentEntity> consentEntities = consentEntityRepository.findById(consentId);
        if(consentEntities.isEmpty()){
            throw new ApplicationContextException(ErrorConstants.CONSENT_NOT_FOUND);
        }else {
            if (consentId != null) {
                ConsentEntity consentEntity = consentEntities.get();
                consentEntity.setStatus(body.getData().getStatus());
                consentEntityRepository.save(consentEntity);
            }
        }
    }

}
