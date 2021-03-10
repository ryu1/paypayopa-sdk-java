package jp.ne.paypay.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import jp.ne.paypay.model.QRCode.RedirectTypeEnum;

/**
 * Account Link QRCode
 */

public class AccountLinkQRCode {

    @SerializedName("scopes")
    private List<AuthorizationScope> scopes = null;

    @SerializedName("nonce")
    private String nonce = null;

    @SerializedName("redirectType")
    private RedirectTypeEnum redirectType = RedirectTypeEnum.WEB_LINK;

    @SerializedName("redirectUrl")
    private String redirectUrl = null;

    @SerializedName("referenceId")
    private String referenceId = null;

    @SerializedName("phoneNumber")
    private String phoneNumber = null;

    @SerializedName("deviceId")
    private String deviceId = null;

    @SerializedName("userAgent")
    private String userAgent = null;

    /**
     * Get scopes
     *
     * @return scopes
     */
    public List<AuthorizationScope> getScopes() {
        return scopes;
    }

    public AccountLinkQRCode setScopes(List<AuthorizationScope> scopes) {
        this.scopes = scopes;
        return this;
    }

    /**
     * Get nonce
     *
     * @return nonce
     */
    public String getNonce() {
        return nonce;
    }

    public AccountLinkQRCode setNonce(String nonce) {
        this.nonce = nonce;
        return this;
    }

    /**
     * Get redirectType
     *
     * @return redirectType
     */
    public RedirectTypeEnum getRedirectType() {
        return redirectType;
    }

    public AccountLinkQRCode setRedirectType(RedirectTypeEnum redirectType) {
        this.redirectType = redirectType;
        return this;
    }

    /**
     * get redirectUrl
     *
     * @return redirectUrl
     */
    public String getRedirectUrl() {
        return redirectUrl;
    }

    public AccountLinkQRCode setRedirectUrl(String redirectUrl) {
        this.redirectUrl = redirectUrl;
        return this;
    }

    /**
     * Get referenceId
     *
     * @return referenceId
     */
    public String getReferenceId() {
        return referenceId;
    }

    public AccountLinkQRCode setReferenceId(String referenceId) {
        this.referenceId = referenceId;
        return this;
    }

    /**
     * Get phoneNumber
     *
     * @return phoneNumber
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    public AccountLinkQRCode setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    /**
     * Get deviceId
     *
     * @return deviceId
     */
    public String getDeviceId() {
        return deviceId;
    }

    public AccountLinkQRCode setDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }

    /**
     * Get deviceId
     *
     * @return deviceId
     */
    public String getUserAgent() {
        return userAgent;
    }

    public AccountLinkQRCode setUserAgent(String userAgent) {
        this.userAgent = userAgent;
        return this;
    }

    @Override
    public String toString() {
        return "AccountLinkQRCode{" +
                "scopes=" + scopes +
                ", nonce='" + nonce + '\'' +
                ", redirectType=" + redirectType +
                ", redirectUrl='" + redirectUrl + '\'' +
                ", referenceId='" + referenceId + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", deviceId='" + deviceId + '\'' +
                ", userAgent='" + userAgent + '\'' +
                '}';
    }
}



