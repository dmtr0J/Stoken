import React from "react";
import type { Metadata } from "next";
import "./globals.css"

export const metadata: Metadata = {
    title: "Stoken",
    description: "Tokenization platform",
};

export default function RootLayout({ children }: Readonly<{ children: React.ReactNode;
}>) {
    return (
        <html lang="en" data-theme="light">
            <body>
                {children}
            </body>
        </html>
    );
}

