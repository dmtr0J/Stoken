import React from 'react'
import Image from "next/image";
import Link from "next/link";

const Hero = () => {
    return (
        // <section className="bg-gradient-to-r from-violet-950 to-violet-600 text-white py-20">
        //     <div className="container mx-auto px-6 lg:px-20 flex flex-col lg:flex-row items-center">
        //         <div className="lg:w-1/2 mb-12 lg:mb-0 text-center lg:text-left">
        //             <h1 className="text-4xl lg:text-6xl font-bold leading-tight">
        //                 Tokenize Your Assets Seamlessly
        //             </h1>
        //             <p className="mt-4 text-lg text-gray-200">
        //                 Unlock liquidity and maximize investment opportunities with our cutting-edge tokenization
        //                 platform for real estate and beyond.
        //             </p>
        //             <div
        //                 className="mt-8 flex flex-col sm:flex-row sm:space-x-4 space-y-4 sm:space-y-0 justify-center lg:justify-start">
        //                 <button
        //                     className="px-6 py-3 bg-white text-violet-900 font-medium rounded-lg shadow-lg hover:bg-gray-100 transition duration-300">
        //                     Get Started
        //                 </button>
        //                 <button
        //                     className="px-6 py-3 border border-white text-white font-medium rounded-lg hover:bg-white hover:text-violet-900 transition duration-300">
        //                     Learn More
        //                 </button>
        //             </div>
        //         </div>
        //
        //         <div className="lg:w-1/2 flex justify-center lg:justify-end">
        //             <Image
        //                 src="/hero.svg"
        //                 height={200}
        //                 width={200}
        //                 alt="Tokenization platform graphic"
        //                 className="w-full max-w-md lg:max-w-lg"
        //             />
        //         </div>
        //     </div>
        // </section>
        <section className="relative bg-gradient-to-b from-primary/10 to-background pt-24 pb-12 overflow-hidden">
            {/* Abstract Background Shapes */}
            <div className="absolute inset-0 overflow-hidden pointer-events-none">
                {/* Large Gradient Circle */}
                <div
                    className="absolute -right-32 -top-32 w-[40rem] h-[40rem] rounded-full bg-gradient-to-br from-primary/30 to-primary/5 blur-2xl"/>
                {/* Animated Blob */}
                <svg
                    className="absolute -left-32 -bottom-32 w-[40rem] h-[40rem] text-primary/20 animate-[spin_30s_linear_infinite]"
                    viewBox="0 0 200 200"
                    xmlns="http://www.w3.org/2000/svg"
                >
                    <defs>
                        <linearGradient id="blob-gradient" x1="0%" y1="0%" x2="100%" y2="100%">
                            <stop offset="0%" style={{stopColor: 'currentColor', stopOpacity: 0.3}}/>
                            <stop offset="100%" style={{stopColor: 'currentColor', stopOpacity: 0.1}}/>
                        </linearGradient>
                    </defs>
                    <path
                        fill="url(#blob-gradient)"
                        d="M41.2,-70.6C54.8,-64.1,68,-55.3,76.3,-42.7C84.6,-30.1,88,-13.8,86.6,1.8C85.2,17.5,79,32.4,70.1,45.3C61.2,58.2,49.6,69,35.9,74.8C22.2,80.6,6.4,81.3,-8.6,78.5C-23.6,75.7,-37.8,69.3,-50.1,60.2C-62.4,51.1,-72.8,39.2,-78.3,25.1C-83.8,11,-84.4,-5.3,-79.9,-19.7C-75.4,-34,-65.8,-46.4,-53.7,-53.7C-41.6,-61,-27,-63.2,-13.6,-70.1C-0.2,-77,13.9,-88.6,27.7,-86.5C41.4,-84.4,54.8,-68.6,41.2,-70.6Z"
                        transform="translate(100 100)"
                    />
                </svg>
            </div>

            <div className="container mx-auto px-4 relative">
                <div className="max-w-4xl mx-auto text-center">
                    <h1 className="text-5xl font-bold tracking-tight mb-6">
                        Democratizing Real Estate Investment Through{" "}
                        <span className="text-primary">Tokenization</span>
                    </h1>
                    <p className="text-xl text-muted-foreground mb-8">
                        Invest in premium real estate properties with as little as $100. Own, trade, and earn from
                        fractional property ownership.
                    </p>
                    <div className="flex gap-4 justify-center">
                        <Link
                            href="/properties"
                            className="inline-flex items-center px-6 py-3 rounded-lg bg-primary text-primary-foreground hover:bg-primary/90 transition-colors"
                        >
                            Explore Properties
                        </Link>
                        <Link
                            href="/learn"
                            className="inline-flex items-center px-6 py-3 rounded-lg border border-input bg-background hover:bg-accent transition-colors"
                        >
                            Learn More
                        </Link>
                    </div>
                </div>
            </div>
        </section>
    )
}
export default Hero
