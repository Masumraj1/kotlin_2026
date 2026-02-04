# Kotlin শুরু করার গাইড - MacBook এ

এই গাইডটি আপনাকে MacBook এ Kotlin ইনস্টল করতে এবং Android Studio দিয়ে প্রথম প্রোজেক্ট তৈরি করতে সাহায্য করবে।


---

## 📋 বিষয়বস্তু
1. [Kotlin ইনস্টলেশন](#kotlin-ইনস্টলেশন)
2. [Kotlin যাচাই করা](#kotlin-যাচাই-করা)
3. [প্রথম Kotlin প্রোগ্রাম](#প্রথম-kotlin-প্রোগ্রাম)
4. [Android Studio সেটআপ](#android-studio-সেটআপ)
5. [সমস্যা সমাধান](#সমস্যা-সমাধান)

---

## 🚀 Kotlin ইনস্টলেশন

### ধাপ ১: Homebrew দিয়ে Kotlin ইনস্টল করুন

টার্মিনাল ওপেন করুন এবং নিচের কমান্ডটি রান করুন:

```bash
brew install kotlin
```

### ধাপ ২: ইনস্টলেশন সম্পন্ন হওয়ার জন্য অপেক্ষা করুন

Homebrew স্বয়ংক্রিয়ভাবে Kotlin এবং প্রয়োজনীয় ডিপেন্ডেন্সি ডাউনলোড ও ইনস্টল করবে।

---

## ✅ Kotlin যাচাই করা

### ভার্সন চেক করুন

ইনস্টলেশন সফল হয়েছে কি না যাচাই করতে:

```bash
kotlinc -version
```

**আউটপুট দেখতে হবে:**
```
info: kotlinc-jvm 1.x.x (অথবা আপনার ইনস্টল করা ভার্সন)
```

---

## 👨‍💻 প্রথম Kotlin প্রোগ্রাম

### ধাপ ১: একটি Kotlin ফাইল তৈরি করুন

```bash
nano hello.kt
```

### ধাপ ২: নিচের কোডটি পেস্ট করুন

```kotlin
fun main() {
    println("Hello Kotlin from MacBook!")
}
```

**সেভ করার জন্য:**
- `Ctrl + O` চাপুন (সেভ করতে)
- `Enter` চাপুন
- `Ctrl + X` চাপুন (বের হতে)

### ধাপ ৩: ফাইল চেক করুন

সব ফাইল দেখতে:

```bash
ls
```

আপনার `hello.kt` ফাইল দেখা উচিত।

### ধাপ ৪: যদি ভুল ফাইল তৈরি হয়

যদি `hello.kt.save` তৈরি হয়ে যায়, তাহলে নাম ঠিক করুন:

```bash
mv hello.kt.save hello.kt
```

### ধাপ ৫: কম্পাইল এবং রান করুন

**কম্পাইল করুন:**
```bash
kotlinc hello.kt -include-runtime -d hello.jar
```

**রান করুন:**
```bash
java -jar hello.jar
```

**আউটপুট:**
```
Hello Kotlin from MacBook!
```

✅ **অভিনন্দন!** আপনি সফলভাবে প্রথম Kotlin প্রোগ্রাম রান করেছেন!

---

## 📱 Android Studio সেটআপ

### ধাপ ১: Android Studio ওপেন করুন

1. আপনার MacBook এ Android Studio চালু করুন
2. প্রথমবার খুললে সেটআপ উইজার্ড অনুসরণ করুন

### ধাপ ২: নতুন প্রোজেক্ট তৈরি করুন

1. **"New Project"** এ ক্লিক করুন
2. প্রোজেক্ট টেমপ্লেট থেকে **"Empty Views Activity"** সিলেক্ট করুন
3. **"Next"** বাটনে ক্লিক করুন

### ধাপ ৩: প্রোজেক্ট কনফিগার করুন

নিম্নলিখিত অপশনগুলো পূরণ করুন:

| অপশন | মান |
|-------|-----|
| **Name** | আপনার প্রোজেক্টের নাম (যেমন: MyFirstApp) |
| **Package name** | com.example.myfirstapp |
| **Save location** | আপনার পছন্দের লোকেশন |
| **Language** | **Kotlin** ✅ (নিশ্চিত করুন) |
| **Minimum SDK** | API 24 বা তার উপরে |

### ধাপ ৪: প্রোজেক্ট তৈরি করুন

1. **"Finish"** বাটনে ক্লিক করুন
2. প্রোজেক্ট ওপেন হওয়ার জন্য অপেক্ষা করুন

⏳ **গুরুত্বপূর্ণ:** প্রথমবার Gradle build হতে কয়েক মিনিট সময় লাগতে পারে। ধৈর্য ধরুন!

### ধাপ ৫: প্রোজেক্ট স্ট্রাকচার দেখুন

Gradle build সম্পন্ন হলে, বাম দিকে Project Explorer এ দেখবেন:

```
app/
├── manifests/
│   └── AndroidManifest.xml
├── kotlin+java/
│   └── com.example.myfirstapp/
│       └── MainActivity.kt  ← আপনার মূল কোড ফাইল
└── res/
    ├── layout/
    │   └── activity_main.xml
    └── values/
```

### ধাপ ৬: অ্যাপ রান করুন

1. উপরে **"Run"** বাটনে ক্লিক করুন (সবুজ ত্রিভুজ আইকন)
2. একটি Emulator সিলেক্ট করুন অথবা ফিজিক্যাল ডিভাইস কানেক্ট করুন
3. অ্যাপ বিল্ড এবং রান হবে

---

## 🛠 সমস্যা সমাধান

### সমস্যা ১: `kotlinc: command not found`

**সমাধান:**
```bash
brew reinstall kotlin
```

### সমস্যা ২: Gradle build ফেইল হচ্ছে

**সমাধান:**
1. Android Studio রিস্টার্ট করুন
2. **File → Invalidate Caches / Restart**
3. **Invalidate and Restart** সিলেক্ট করুন

### সমস্যা ৩: JDK পাওয়া যাচ্ছে না

**সমাধান:**
```bash
brew install openjdk
```

তারপর path সেট করুন:
```bash
echo 'export PATH="/opt/homebrew/opt/openjdk/bin:$PATH"' >> ~/.zshrc
source ~/.zshrc
```

### সমস্যা ৪: ভুল ফাইল নাম (hello.kt.save)

**সমাধান:**
```bash
mv hello.kt.save hello.kt
```


## 📝 নোট

- এই README ফাইলটি **MacBook** এর জন্য তৈরি
- Kotlin ভার্সন এবং Android Studio ভার্সন সময়ের সাথে আপডেট হতে পারে
- সমস্যা হলে Stack Overflow বা Android Developer Community তে প্রশ্ন করতে পারেন

---

**শুভকামনা এবং Happy Coding! 🎉**

---

*তৈরি করেছেন: Kotlin শিক্ষার্থীদের জন্য*  
*সর্বশেষ আপডেট: ফেব্রুয়ারি ২০২৬*
