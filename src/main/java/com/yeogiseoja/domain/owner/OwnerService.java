package com.yeogiseoja.domain.owner;

public interface OwnerService {
    OwnerInfo.OwnerSummaryInfo registerOwner(OwnerCommand.RegisterOwnerRequest request);
    OwnerInfo.OwnerSummaryInfo updateOwner(OwnerCommand.UpdateOwnerRequest request);
    OwnerInfo.OwnerSummaryInfo confirmAuthOwner(OwnerCommand.ConfirmAuthRequest request);

   // OwnerInfo.OwnerDetailInfo detailInfoOwner()

    boolean removeOwner(OwnerCommand.RemoveOwnerRequest request);
    boolean passwordChangeOwner(OwnerCommand.OwnerPasswordChangeRequest request);
}
