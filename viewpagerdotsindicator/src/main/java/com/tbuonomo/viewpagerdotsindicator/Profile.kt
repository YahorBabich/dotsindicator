package com.tbuonomo.viewpagerdotsindicator

import java.util.*

data class Profile(
        val pnum: String = "",
        val username: String? = null,
        val nickname: String? = null,
        val caption: String? = null,
        val latitude: String? = null,
        val longitude: String? = null,
        val eye_color: String? = null,
        val hair_color: String? = null,
        val dob: String? = null,
        val age: String? = null,
        val city: String? = null,
        val state: String? = null,
        val state_code: String? = null,
        val country_code: String? = null,
        val country: String? = null,
        val country_id: String? = null,
        val state_id: String? = null,
        val gender: String? = null,
        val height: String? = null,
        val weight: String? = null,
        val height_int: String? = null,
        val weight_int: String? = null,
        val bodytype: String? = null,
        val bodytype_id: String? = null,
        val limits: String? = null,
        val limits_id: String? = null,
        val seeking_id: String? = null,
        val seeking: String? = null,
        val smoking: String? = null,
        val lastlogin: String? = null,
        val ethnicity: String? = null,
        val ethnicity_id: String? = null,
        val language: String? = null,
        val languages_spoken: HashMap<String, String>? = null,
        val online_status: String? = null,
        val intimate_desires_title: String? = null,
        val intimate_desires_text: String? = null,
        val intimate_desires_options: String? = null,
        val intimate_desires_options_ids: String? = null,
        val perfect_match_title: String? = null,
        val perfect_match_text: String? = null,
        val perfect_match_options: String? = null,
        val perfect_match_options_ids: String? = null,
        val personal_interests_title: String? = null,
        val personal_interests_text: String? = null,
        val personal_interests_options: String? = null,
        val personal_interests_options_ids: String? = null,
        val view_rated: Boolean? = null,
        val mobile_enabled: Boolean? = null,
        val mobile_access: Boolean? = null,
        val priority_mail_enabled: Boolean? = null,
        val fraud_status: String? = null,
        val dnd: String? = null,
        val mobile_notifications: Boolean? = null,
        val twoFactorEnabled: String? = null,
        val priority_man: Boolean? = null,
        val traveling_enabled: Boolean? = null,
        val traveling_search_limit_reached: Boolean? = null,
        val profile_location: String? = null,
        val pending_intimate_desires_other: String? = null,
        val pending_intimate_desires_text: String? = null,
        val pending_personal_interests_other: String? = null,
        val pending_personal_interests_text: String? = null,
        val pending_perfect_match_other: String? = null,
        val pending_perfect_match_text: String? = null,
        val favorite: Boolean? = null,
        val full_member: Boolean? = null,
        val has_mic: Boolean? = null,
        val married_status: String? = null,
        val current_location: String? = null,
        val can_see_private_showcase: Boolean? = null,
        val can_send_private_key_request: Boolean? = null,
        val isApproved: Int? = null,
        val isHidden: Int? = null,
        val isLowTraffic: Boolean? = null,
        val can_wink: Boolean? = null,
        val horoscope: String? = null,
        val private_showcase: Boolean? = null,
        val priority_man_package: PriorityManPackage? = null,
        val lookForMatchEmailOptIn: Boolean? = null,
        val unlimited_credits: Boolean? = null,
        val is_dating_coach: Boolean? = null,
        val is_chat_friend: Boolean? = null,
        val is_chat_friend_female: Boolean? = null,
        val contact_phone_number: String? = null,
        var photos: List<Photo>? = null,
        val credits: Int? = null,
        val has_rebuy_options: Boolean? = null,
        val has_rebuy_creditcard: Boolean? = null,
        val has_promos: Boolean? = null,
        val distance_unit: DistanceUnit? = null,
        val has_purchased: Boolean? = null,
        val new_payment: Boolean? = null,
        val hasMessagePlus: Boolean? = null,
        val paidMessagePlus: Boolean? = null,
        val tests: Tests? = null,
        val should_notify_password_reset: Boolean? = null,
        val auto_optin: Int? = null,
        val emailVerified: Int? = null,
        val emailLastChange: String? = null,
        val emailVerificationLockedOut: Int? = null,
        val emailVerificationNag: Int? = null,
        val encryptedUserId: String? = null,
        val email: String? = null,
        val show_coaching_ad: Boolean? = null,
        // ------------------
        // OTHER PROFILE DATA
        // ------------------
        val is_new: String? = null,
        val is_travelling: Boolean? = null,
        val comm_channel_open: Boolean? = null
) {

    data class PriorityManPackage(
            val price: Double? = null,
            val days: Int? = null,
            val pricePerDay: Int? = null,
            val denomination: String? = null,
            val pricePerDayDenomination: String? = null
    )

    data class Photo(
            val id: String = "",
            var type: Type? = null,
            val featured: Boolean? = null,
            val approved: Boolean? = null,
            val rated: Boolean? = null,
            val updatedon: Int? = null,
            var urls: Urls? = null
    ) {

        enum class Type {
            PUBLIC,
            PRIVATE,
            HIDDEN
        }

        data class Urls(
                val normal: String? = null,
                val large: String? = null,
                val thumb: String? = null
        )

        val isPublic: Boolean get() = type == Type.PUBLIC

        val isPrivate: Boolean get() = type == Type.PRIVATE

        val isHidden: Boolean get() = type == Type.HIDDEN
    }

    data class DistanceUnit(
            val unit: String? = null,
            val unitName: String? = null


    )
}

data class Tests(
        val message_plus: Boolean? = null,
        val eligible_for_message_plus: Boolean? = null,
        val is_message_plus_expired: Boolean? = null,
        val mobile_payment: Boolean? = null,
        val subscriptionTestGroup: String? = null,
        val ios_subscription_test_free_trial: Boolean? = null,
        val ios_subscription_test_intro_price: Boolean? = null,
        val ios_subscription_test_full_price: Boolean? = null,
        val subscriptionTest: Boolean? = null,
        val two_fa_ios: Boolean? = null,
        val is_brazil_paypal_defaulttype: Boolean? = null,
        val mic_above_buynow: Boolean? = null,
        val new_profile_experience_android: Boolean? = null,
        val new_profile_experience_ios: Boolean? = null,
        val new_profile_experience_mobile: Boolean? = null,
        val subscription_call_to_cancel_test: Boolean? = null,
        val mae_experience_android: Boolean? = null,
        val mae_experience_desktop_mobile_web: Boolean? = null,
        val mae_experience_ios: Boolean? = null,
        val new_messaging_ios: Boolean? = null,
        val new_messaging_android: Boolean? = null,
        val new_messaging_mobileweb: Boolean? = null,
        val new_messaging_desktop: Boolean? = null,
        val credit_card_v2_endpoint: Boolean? = null
)