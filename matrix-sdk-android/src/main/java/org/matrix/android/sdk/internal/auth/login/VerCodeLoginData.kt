package org.matrix.android.sdk.internal.auth.login

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * Created by chengww on 11/15/20
 *
 * Data class for ver code login input.
 * @param type must be one of the
 * [EACHCHAT_MSISDN_CODE] or
 * [EACHCHAT_EMAIL_CODE]
 *
 * @param email required for type [EACHCHAT_EMAIL_CODE] else optional
 * @param msisdn required for type [EACHCHAT_MSISDN_CODE] else optional
 * @param code the ver code
 *
 * @author chengww
 */
@JsonClass(generateAdapter = true)
data class VerCodeLoginData(
        @Json(name = "type") val type: String,
        @Json(name = "email") val email: String?,
        @Json(name = "msisdn") val msisdn: String?,
        @Json(name = "ver_code") val code: String,
        @Json(name = "initial_device_display_name") val deviceDisplayName: String?
)

const val EACHCHAT_MSISDN_CODE = "m.login.verCode.msisdn"
const val EACHCHAT_EMAIL_CODE = "m.login.verCode.email"