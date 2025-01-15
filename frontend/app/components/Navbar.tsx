import React from 'react'
import Image from "next/image";
import Link from "next/link";

const Navbar = () => {
    return (
        <header className="bg-white sticky top-0 z-50">
            <nav className="container mx-auto flex items-center justify-between py-2 px-6">
                <Link href="/">
                    <Image
                        className="m-2"
                        src="/logo.svg"
                        alt="logo"
                        width={130}
                        height={30}
                    />
                </Link>

                <div>
                    <ul className="flex space-x-8 text-gray-900 font-medium">
                        <li>
                            <a href="#" className="hover:text-purple-900 transition duration-300">Home</a>
                        </li>
                        <li>
                            <a href="#" className="hover:text-purple-900 transition duration-300">Product</a>
                        </li>
                        <li>
                            <a href="#" className="hover:text-purple-900 transition duration-300">Solution</a>
                        </li>
                        <li>
                            <a href="#" className="hover:text-purple-900 transition duration-300">How it works</a>
                        </li>
                    </ul>
                </div>
            </nav>
        </header>
    )
}
export default Navbar
