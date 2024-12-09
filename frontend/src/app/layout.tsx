import React from "react";
import Image from "next/image";

export default function RootLayout({
  children,
}: Readonly<{
  children: React.ReactNode;
}>) {
  return (
    <html lang="en">
      <body>
        <Image
            className='m-6'
            src="/stoken_logo.svg"
            alt="Stoken logo"
            width={160}
            height={80}
            priority
        />
        {children}
      </body>
    </html>
  );
}
