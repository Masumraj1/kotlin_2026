# Kotlin শুরু করার গাইড - MacBook এ

এই গাইডটি আপনাকে MacBook এ Kotlin ইনস্টল করতে এবং Android Studio দিয়ে প্রথম প্রোজেক্ট তৈরি করতে সাহায্য করবে।


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

সব ফাইল দেখতে:

```bash
ls
```


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

### সমস্যা 1: JDK পাওয়া যাচ্ছে না

**সমাধান:**
```bash
brew install openjdk
```

তারপর path সেট করুন:
```bash
echo 'export PATH="/opt/homebrew/opt/openjdk/bin:$PATH"' >> ~/.zshrc
source ~/.zshrc
```

## 📝 নোট

- এই README ফাইলটি **MacBook** এর জন্য তৈরি
- Kotlin ভার্সন এবং Android Studio ভার্সন সময়ের সাথে আপডেট হতে পারে
- সমস্যা হলে Stack Overflow বা Android Developer Community তে প্রশ্ন করতে পারেন



### Q1: অ্যান্ড্রয়েড অ্যাপের নাম (Display Name) কীভাবে পরিবর্তন করতে হয়? 
- Ans: res > values > strings.xml ফাইলে গিয়ে <string name="app_name"> ট্যাগের ভেতরে নতুন নাম লিখে দিলেই অ্যাপের নাম পরিবর্তন হয়ে যায়।

### Q2: সরাসরি ম্যানিফেস্ট ফাইলে নাম পরিবর্তন না করে strings.xml ব্যবহার করা হয় কেন? 
- Ans: এটি একটি "Best Practice"। এর ফলে অ্যাপে সহজেই একাধিক ভাষা (যেমন: বাংলা ও ইংরেজি) যুক্ত করা যায় এবং এক জায়গা থেকেই পুরো অ্যাপের নাম নিয়ন্ত্রণ করা যায়।

### Q3: AndroidManifest.xml দেখে কীভাবে বুঝবো কোন স্ক্রিনটি আগে ওপেন হবে? 
- Ans: যে <activity> ট্যাগের ভেতরে নিচের intent-filter কোডটুকু থাকবে, সেই স্ক্রিনটিই অ্যাপ ওপেন করলে সবার আগে আসবে:

```bash
<intent-filter>
    <action android:name="android.intent.action.MAIN" />
    <category android:name="android.intent.category.LAUNCHER" />
</intent-filter>
```