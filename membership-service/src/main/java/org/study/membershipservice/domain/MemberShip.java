package org.study.membershipservice.domain;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Value;

@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class MemberShip {

    @Getter
    private final String membershipId;

    @Getter
    private final String name;

    @Getter
    private final String email;

    @Getter
    private final String address;

    @Getter
    private final boolean isValid;

    @Getter
    private final boolean isCorp;

    // 오염이 되면 안되는 클래스. 고객 정보. 핵심 도메인

    public static MemberShip generateMember(
            MemberShipId memberShipId,
            MemberShipName memberShipName,
            MemberShipEmail memberShipEmail,
            MemberShipAddress memberShipAddress,
            MemberShipIsValid memberShipIsValid,
            MemberShipIsCorp memberShipIsCorp
    ) {
        return new MemberShip(
                memberShipId.membershipId,
                memberShipName.membershipName,
                memberShipEmail.membershipEmail,
                memberShipAddress.membershipAddress,
                memberShipIsValid.membershipIsValid,
                memberShipIsCorp.membershipIsCorp
        );
    }

    @Value
    public static class MemberShipId {
        String membershipId;

        public MemberShipId(String value) {
            this.membershipId = value;
        }
    }

    @Value
    public static class MemberShipName {
        String membershipName;

        public MemberShipName(String value) {
            this.membershipName = value;
        }
    }

    @Value
    public static class MemberShipEmail {
        String membershipEmail;

        public MemberShipEmail(String value) {
            this.membershipEmail = value;
        }
    }

    @Value
    public static class MemberShipAddress {
        String membershipAddress;

        public MemberShipAddress(String value) {
            this.membershipAddress = value;
        }
    }

    @Value
    public static class MemberShipIsValid {
        boolean membershipIsValid;

        public MemberShipIsValid(boolean value) {
            this.membershipIsValid = value;
        }
    }

    @Value
    public static class MemberShipIsCorp {
        boolean membershipIsCorp;

        public MemberShipIsCorp(boolean value) {
            this.membershipIsCorp = value;
        }
    }
}
