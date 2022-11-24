package ir.bankid.common.util;

public class Messages {
    public static final String BAD_REQUEST = "درخواست نامعتبر.";

    public static final String INVALID_PHONE_NUMBER   = "شماره همراه معتبر نیست.";
    public static final String SIAM_INVALID_PHONE_AND_NATIONAL_CODE   = "اطالعات ارسالی با شناسه هویتی اعالم شده هم خوانی ندارد";
    public static final String SIAM_INVALID_USERNAME_PASSWORD   = "نام کاربري یا کلمه عبور درج شده در Header Authorization Basic صحیح نمی باشد.";
    public static final String INVALID_TOKEN          = "token not provided";
    public static final String INVALID_NATIONAL_CODE = "کد ملی نامعتبر است";
    public static final String INVALID_TELEPHONE      = "شماره تلفن معتبر نیست.";

    public static final String FULL_ADDRESS_EMPTY    = "آدرس را وارد کنید.";
    public static final String INVALID_DATA          = "اطلاعات شما کامل نیست.";

    public static final String USER_NOT_FOUND     = "user not found";
    public static final String BUSINESS_NOT_FOUND = "business not found";
    public static final String FILE_NOT_FOUND     = "file not found";
    public static final String NATIONAL_CODE_NOT_FOUND     = "کاربر مورد نطر وجود ندارد";
    public static final String IMG_SABT_AHVAL_NOT_CREATE     = "sabt ahval image is not created";
    public static final String IMG_SIMORGH_NOT_CREATE     = "simorgh image is not created";
    public static final String NOT_FOUND     = "not found";
    public static final String DETERMINE_FILE_TYPE = "Could not determine file type.";

    public static final String USER_NOT_LOGIN_YET          = "user not login yet";


    public static final String USER_LOCKED                = "دسترسی شما به یوآیدی قطع شده است";
    public static final String UNAUTHORIZED               = "عدم دسترسی";
    public static final String TOKEN_IS_EXPIRED               = "توکن شما منقضی شده است";
    public static final String INCORRECT_EMAIL          = "ایمیل نامعتبر می باشد.";
    public static final String USE_PERSIAN_KEYBOARD     = "لطفا از صفحه کلید فارسی استفاده کنید.";
    public static final String SERVICE_UNAUTHORIZED     = "دسترسی غیر مجاز به سرویس.";
    public static final String INVALID_IP               = "آی پی نامعتبر";

    public static final String USER_ALREADY_APPROVED = "شما قبلا احراز هویت شده اید.";
    public static final String USER_TOO_MANY_REQUESTS    = "چهره شما در ویدئوی ارسالی با تصویر شما در سامانه ثبت احوال(تصویر کارت ملی) مطابقت ندارد!";
    public static final String TOO_MANY_REQUESTS    ="درخواست کاربر مورد نظر بیش از حد مجاز می باشد";
    public static final String NATIONAL_CARD_IS_MANDATORY = "کد ملی نمیتواند خالی باشد";
    public static final String BIRTH_DATE_IS_MANDATORY = "تاریخ تولد نمیتواند خالی باشد";
    public static final String NATIONAL_CARD_SERIAL_NUMBER_IS_MANDATORY = "سریال کد ملی نمیتواند خالی باشد";
    public static final String OCR_CANT_DETECT_DATA = "اطلاعات کارت خوانا نیست لطفا عکس واضح تری بفرستید.";
    public static final String FACES_NOT_THE_SAME = "تصاویر متعلق به یک شخص نیست.";
    public static final String SERVICE_UNAVAILABLE = "سامانه با مشکل مواجه شده است. لطفا لحظاتی دیگر تلاش کنید.";
    public static final String SABT_SERVICE_UNAVAILABLE = "ثبت احوال در دسترس نمی باشد.";
    public static final String SIMORGH_SERVICE_UNAVAILABLE = "سرویس بانک تجارت در دسترس نمی باشد";
    public static final String JUSTICE_SERVICE_UNAVAILABLE = "سرویس قوه قضاییه در دسترس نمی باشد";
    public static final String NOT_FOUND_PIC = "فایل برای کاربر مورد نظر یافت نشد";
    public static final String CAN_NOT_COPY_FILE = "فایل برای کاربر مورد نظر یافت نشد";
    public static final String SIGNATURE_IS_MANDATORY = "فایل امضا نمی تواند خالی باشد";
    public static final String NOT_FOUND_USER = "کاربر مورد نظر یافت نشد";
    public static final String NOT_FOUND_CONFIG = "کانفیگی یافت نشد";
    public static final String INVALID_VIDEO = "ویدئوی ارسالی مورد تایید نیست. لطفا دوباره تلاش کنید.";
    public static final String MESSAGE_LIVENESS_REAL = "REAL";
    public static final String MESSAGE_LIVENESS_NOT_SURE = "NOT_SURE";
    public static final String MESSAGE_LIVENESS_FAKE = "FAKE";
    public static final String INVALID_REQUEST = "درخواست نامعتبر";
    public static final String NOT_FOUND_LID = "lid یافت نشد";
    public static final String CAN_NOT_CHANGE_APPROVE = "وضعیت کاربر قابل تغییر نمیباشد";
    public static final String AUTHENTICATION_IS_NOT_DONE = "کاربر مورد نظر احراز هویت نشده است";
    public static final String FILE_IS_EMPTY = "فایل ورودی خالی میباشد";

    public static final String  REQUEST_IS_APPROVED = "درخواست تایید شد. ";
    public static final String  INTERNAL_SERVER_ERROR = " سامانه با مشکل مواجه شده است. لطفا لحظاتی دیگر تلاش کنید.";
    public static final String  CAN_NOT_UPLOAD_FILE = " فایل مورد نظر آپلود نشد";
    public static final String  FN_NOT_AVAILABLE = " فایل مورد نظر آپلود نشد";


    public static final String UID_COMPLETED_SUCCESSFULLY = "درخواست احراز هویت شما با موفقیت ارسال شد.";
    public static final String LIVENESS_COMPLETED_SUCCESSFULLY = "ویدیو تایید شد";

    public static final String LIVENESS_WAS_NOT_REAL = "liveness was not real";


    public static final String LIVENESS_PATH_JPG = "/liveness.jpg";
    public static final String PROFILE_PATH_JPG = "/profile_1.jpg";
    public static final String ID_PATH_JPG = "/id.jpg";
    public static final String SIGNATURE_PATH_JPG = "/signature.jpg";
    public static final String VIDEO_PATH_MP4 = "/video.mp4";


    public static final String AUTHORIZATION = "Authorization";



    //Log and result message
    public static final String SUCCESS = "Success";
    public static final String OK = "OK";
    public static final String FAILED = "Failed";
    public static final String FACE_DO_NOT_MATCH = "Faces do not match";
    public static final String NOT_LIVE = "Not live";
    public static final String MAX_TRY = "Max try";
    public static final String INVALID_CREDENTIAL = " کلمه عبور یا رمز اشتباه است";


    public static final String CAN_NOT_CREATE_FILE = "can't create file";

    //userAgent
    public static final String USER_AGENT_ANDROID = "android";
    public static final String USER_AGENT_IOS = "ios";
    public static final String USER_AGENT_WEB = "web";
    public static final String CAN_NOT_DELETE_FILE = "can not delete file";


    public static final String ELASTICSEARCH_EXCEPTION = "خطا در ارسال دیتا به الستیک سرچ";
    public static final String CAN_NOT_CHANGE_APPROVE_STATE = "وضعیت تایید کاربر قابل تغییر نمی باشد";
    public static final String FILE_IS_MANDATORY = "فایل نمی تواند خالی باشد";
    public static final String MOBILE_NUMBER_IS_MANDATORY = "شماره موبایل نمی تواند خالی باشد";
    public static final String NATIONAL_CODE_IS_MANDATORY = "شماره ملی نمی تواند خالی باشد";
    public static final String OTP_IS_MANDATORY = "لطفا کد ارسالی را وارد کنید";
    public static final String EMAIL_IS_MANDATORY = "ایمیل نمی تواند خالی باشد";
    public static final String FULL_NAME_IS_MANDATORY = "نام و نام خانوادگی نمی تواند خالی باشد";
    public static final String CITY_IS_MANDATORY = "نام شهر نمی تواند خالی باشد";
    public static final String PROVINCE_IS_MANDATORY = "نام استان خود را وارد کنید";
    public static final String ADDRESS_IS_MANDATORY = " محل سکونت خود را وارد کنید";
    public static final String SHEBA_IS_MANDATORY = " شماره شبا نمی تواند خالی باشد";
    public static final String ACCOUNT_NUMBER_IS_MANDATORY = " شماره حساب نمی تواند خالی باشد";
    public static final String BANK_CARD_IS_MANDATORY = "شماره کارت بانکی نمی تواند خالی باشد";
    public static final String BANK_NAME_IS_MANDATORY = "نام بانک خود را وارد کنید";

    public static final String NOT_FOUND_BUSINESS = "بیزینس نامعتبر";
    public static final String EMAILE_IS_EXSIT = "ایمیل تکراری می باشد";
    public static final String INVALID_EMAIL_ADDRESS = "ایمیل صحیح نمی باشد";

    public static final String RESULT_FAKE = "زنده نبودن ویدئوی ارسالی";
    public static final String RESULT_FAR_FACE = "فاصله بیش از حد با دوربین";
    public static final String RESULT_NO_FACE = "عدم وجود چهره در تصویر";
    public static final String RESULT_MANY_FACE = "وجود چند چهره در تصویر";
    public static final String RESULT_INCOMPATIBLE_HEJAB = "عدم رعایت شئونات اسلامی";
    public static final String RESULT_INCOMPATIBLE_BACKGROUND = "مناسب نبودن پس زمینه تصویر";
    public static final String RESULT_LIGHT_VIDEO = "نور نامناسب تصویر";
    public static final String RESULT_INCOMPATIBLE_ANGLE_CAMERA = "زاویه نامناسب دوربین";
    public static final String SEND_RESULT_AUTO_MODE = "system";
    public static final String SERVICE_UNAVAILABLE_ERROR_EXCEPTION = "سرویس مربوطه در دسترس نمی باشد";

    public static final String RESULT_OK = "تایید";

    public static final String RESULT_ERROR_LIGHT_VIDEO = "نور نامناسب تصویر";
    public static final String RESULT_ERROR_INCOMPATIBLE_ANGLE_CAMERA = "زاویه نامناسب دوربین";
    public static final String RESULT_ERROR_INCOMPATIBLE_LOOK_CAMERA = "عدم نگاه کردن مستقیم دوربین";
    public static final String RESULT_ERROR_INVALID_SIGNATURE = "نامعتبر بودن امضا";
    public static final String RESULT_ERROR_INCOMPATIBLE_INCOMPATIBLE_HEJAB = "عدم رعایت شئونات اسلامی";
    public static final String RESULT_ERROR_INCOMPATIBLE_INCOMPATIBLE_BACKGROUND = "مناسب نبودن پس زمینه تصویر";

    public static final String SMS_ENGINE_SERVICE_IS_UNAVAILABLE = "سرویس ارسال پیامک از دسترس خارج می باشد";
    public static final String SHAHKAR_SERVICE_IS_UNAVAILABLE = "سرویس شاهکار در دسترس نمی باشد";
    public static final String ERROR_DURING_SITAD_IMG_SERVICE = "خطا در دریافت عکس از سرویس ثبت احوال";
    public static final String NOT_FOUND_ADMIN = "ادمینی با مشخصات شما یافت نشد";
    public static final String PASSWORD_DOES_NOT_HAVE_SECURITY_REQUIREMENTS = "پسورد باید الزامات امنیتی را رعایت کند";

    public static final String CHAIN_HAS_EXPIRED = "زنجیره مورد استفاده شما منقضی شده , لطفا مجددا تلاش نمایید";
    public static final String INTERNAL_ERROR_IN_PKE_SERVICE = "خطا داخلی در سرویس pke,لطفا مجددا تلاش نمایید";



}
