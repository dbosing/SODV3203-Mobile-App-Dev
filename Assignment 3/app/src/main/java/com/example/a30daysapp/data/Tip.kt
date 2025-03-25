package com.example.a30daysapp.data

import androidx.annotation.DrawableRes
import com.example.a30daysapp.R

data class Tip(
    val day: Int,
    val title: String,
    val description: String,
    @DrawableRes val imageResourceId: Int
)

val tips = listOf(
    Tip(
        1,
        "Create a Monthly Budget",
        "Tracking your income and expenses helps you take control of your financial health. Plan your spending wisely!",
        R.drawable.tip_1
    ),
    Tip(
        2,
        "Set Clear Financial Goals",
        "Define short-term and long-term financial goals. Having a clear goal will keep you motivated and focused.",
        R.drawable.tip_2
    ),
    Tip(
        3,
        "Save at Least 20% of Your Income",
        "Follow the 50/30/20 rule: 50% for needs, 30% for wants, and 20% for savings and investments.",
        R.drawable.tip_3
    ),
    Tip(
        4,
        "Build an Emergency Fund",
        "Having 3-6 months' worth of expenses saved can protect you during unexpected situations.",
        R.drawable.tip_4
    ),
    Tip(
        5,
        "Cut Down on Unnecessary Subscriptions",
        "Review your subscriptions and cancel the ones you rarely use. This can save you a lot over time.",
        R.drawable.tip_5
    ),
    Tip(
        6,
        "Track Your Daily Spending",
        "Use budgeting apps or a simple notebook to track daily expenses. It helps identify areas where you overspend.",
        R.drawable.tip_6
    ),
    Tip(
        7,
        "Automate Your Savings",
        "Set up automatic transfers to your savings account each month so you save before you spend.",
        R.drawable.tip_7
    ),
    Tip(
        8,
        "Use Cash Instead of Credit Cards",
        "Using cash for everyday purchases can help limit unnecessary spending and avoid debt.",
        R.drawable.tip_8
    ),
    Tip(
        9,
        "Plan Your Meals to Save Money",
        "Avoid unnecessary takeouts by planning meals in advance. This can save money and reduce food waste.",
        R.drawable.tip_9
    ),
    Tip(
        10,
        "Avoid Impulse Purchases",
        "Wait at least 24 hours before making a purchase. If you still want it after that time, it’s likely a worthwhile buy.",
        R.drawable.tip_10
    ),
    Tip(
        11,
        "Negotiate Your Bills",
        "Call your service providers and negotiate for better rates. Many companies offer discounts if you ask.",
        R.drawable.tip_11
    ),
    Tip(
        12,
        "Invest in Your Financial Education",
        "Read books, attend webinars, and follow personal finance experts to stay informed.",
        R.drawable.tip_12
    ),
    Tip(
        13,
        "Use Apps to Monitor Your Spending",
        "Apps like Mint or YNAB help analyze spending habits and keep you on track with budgeting.",
        R.drawable.tip_13
    ),
    Tip(
        14,
        "Start a Side Hustle",
        "Extra income from a side hustle can speed up debt repayment and boost savings.",
        R.drawable.tip_14
    ),
    Tip(
        15,
        "Pay Off High-Interest Debt First",
        "Use the debt snowball or avalanche method to clear your highest-interest debt as quickly as possible.",
        R.drawable.tip_15
    ),
    Tip(
        16,
        "Contribute Regularly to Retirement",
        "Start saving early for retirement to take advantage of compound interest.",
        R.drawable.tip_16
    ),
    Tip(
        17,
        "Learn About Investment Options",
        "Stocks, bonds, and real estate are great ways to grow your wealth over time.",
        R.drawable.tip_17
    ),
    Tip(
        18,
        "Increase Your Income",
        "Develop new skills, ask for a raise, or look for better job opportunities.",
        R.drawable.tip_18
    ),
    Tip(
        19,
        "Avoid Unnecessary Debt",
        "Only take loans for important needs like education, home, or business investment.",
        R.drawable.tip_19
    ),
    Tip(
        20,
        "Use Credit Cards Wisely",
        "Pay your balance in full every month to avoid interest and build a good credit score.",
        R.drawable.tip_20
    ),
    Tip(
        21,
        "Declutter and Sell Unused Items",
        "Selling unused items can bring in extra money and help you live minimally.",
        R.drawable.tip_21
    ),
    Tip(
        22,
        "Set Up Automatic Payments",
        "Automating bills prevents late fees and improves your credit score.",
        R.drawable.tip_22
    ),
    Tip(
        23,
        "Review Your Financial Progress Weekly",
        "Regular financial check-ins help you stay on track and make necessary adjustments.",
        R.drawable.tip_23
    ),
    Tip(
        24,
        "Shop Smart and Look for Discounts",
        "Compare prices, use coupons, and wait for sales to get the best deals.",
        R.drawable.tip_24
    ),
    Tip(
        25,
        "Consult a Financial Planner",
        "A financial expert can provide tailored advice for your financial goals.",
        R.drawable.tip_25
    ),
    Tip(
        26,
        "Plan Major Expenses in Advance",
        "Saving up for big purchases instead of taking loans helps you stay debt-free.",
        R.drawable.tip_26
    ),
    Tip(
        27,
        "Save on Transportation Costs",
        "Use public transport, carpool, or bike to save money on fuel and maintenance.",
        R.drawable.tip_27
    ),
    Tip(
        28,
        "Adjust Your Financial Plan as Needed",
        "Life changes, so update your budget and goals regularly.",
        R.drawable.tip_28
    ),
    Tip(
        29,
        "Practice Gratitude and Avoid Overspending",
        "Appreciate what you have to resist unnecessary purchases.",
        R.drawable.tip_29
    ),
    Tip(
        30,
        "Celebrate Financial Wins!",
        "Reward yourself for good financial habits to stay motivated.",
        R.drawable.tip_30
    )
)
