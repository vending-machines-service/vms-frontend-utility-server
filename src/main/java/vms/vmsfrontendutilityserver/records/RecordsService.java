package vms.vmsfrontendutilityserver.records;

import java.time.LocalDate;
import java.util.List;

import org.springframework.stereotype.Service;

import vms.vmsfrontendutilityserver.dto.OperationStatusEnum;
import vms.vmsfrontendutilityserver.dto.records.MTRecordCurrentDTO;
import vms.vmsfrontendutilityserver.dto.records.RecordArchiveDTO;
import vms.vmsfrontendutilityserver.dto.records.RecordCurrentDTO;

@Service
public class RecordsService implements IRecords {

  @Override
  public List<RecordCurrentDTO> getCurrentAllRecord() {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public MTRecordCurrentDTO getCurrentMTRecord(String recordId) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public RecordCurrentDTO getCurrentMFRecord(String recordId) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public List<RecordCurrentDTO> getCurrentMalFunctionRecord() {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public List<MTRecordCurrentDTO> getCurrentMaintenanceRecord() {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public List<RecordCurrentDTO> getArchiveMalFunctionRecord() {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public List<MTRecordCurrentDTO> getArchiveMaintenanceRecord() {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public RecordArchiveDTO getArchiveRecord(int recordId) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public List<RecordCurrentDTO> getCurrentRecordsByMachine(int machineId, int from, int to) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public OperationStatusEnum completeRecord(String id, String comment) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public List<RecordArchiveDTO> getArchiveRecords(LocalDate since, LocalDate until) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public OperationStatusEnum assignTechnician(int recordId, int workerId) {
    // TODO Auto-generated method stub
    return null;
  }
}
